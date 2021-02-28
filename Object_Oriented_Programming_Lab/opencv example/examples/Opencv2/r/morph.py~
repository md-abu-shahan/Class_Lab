import numpy as np
import cv2
from matplotlib import pyplot as plt

nm="108.jpg"
img=cv2.imread(nm)
cv2.imshow('img',img)
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)

# Otsu's thresholding after Gaussian filtering
blur = cv2.GaussianBlur(gray,(5,5),0)
ret3,th = cv2.threshold(blur,0,255,cv2.THRESH_BINARY+cv2.THRESH_OTSU)

cv2.imshow('th',th)
cv2.imwrite('track.jpg',th)

kernel = np.ones((9,9),np.uint8)
erosion = cv2.erode(th,kernel,iterations = 1)
dilation = cv2.dilate(erosion,kernel,iterations = 1)
cv2.imshow('dilation',dilation)
cv2.imshow('erosion',erosion)
cv2.imwrite('erosion.jpg',erosion)
cv2.imwrite('dilation.jpg',dilation)

opening = cv2.morphologyEx(th, cv2.MORPH_OPEN, kernel)
#closing = cv2.morphologyEx(th, cv2.MORPH_CLOSE, kernel)

cv2.imshow('opening',opening)

cv2.waitKey(0)
cv2.destroyAllWindows()

