import numpy as np
import cv2


nm="suduku.jpg"
img=cv2.imread(nm)
gray= cv2.imread(nm,0)
equ = cv2.equalizeHist(gray)
cv2.imwrite('eq.jpg',equ)

im = cv2.imread('r.jpg')
imgray = cv2.cvtColor(im,cv2.COLOR_BGR2GRAY)
ret,thresh = cv2.threshold(imgray,127,255,0)
contours2, hierarchy2 = cv2.findContours(thresh,cv2.RETR_TREE,cv2.CHAIN_APPROX_SIMPLE)
cv2.drawContours(im, contours2, -1, (0,255,0), 2)
cv2.imshow('ct2',im)
cv2.imwrite('contour.jpg',im)



filter= cv2.GaussianBlur(img,(5,5),0)
median = cv2.medianBlur(img,5)
cv2.imshow('filter',median)
cv2.imwrite("filter.jpg",median)

hsv=cv2.cvtColor(img,cv2.COLOR_BGR2HSV)
lr= np.array([160,50,50])
ur= np.array([180,255,255])
mask = cv2.inRange(hsv, lr, ur)

cv2.imshow('red',mask)
 
cv2.imshow('gray',hsv)
cv2.imwrite("gray.jpg",gray)
cv2.imwrite("gray2.jpg",hsv)



gray = cv2.GaussianBlur(gray,(5,5),0)
th  = cv2.adaptiveThreshold(gray,255,1,1,11,2)

cv2.imshow('th',th)
cv2.imwrite("th.jpg",th)

contours, hierarchy = cv2.findContours(th, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)


cv2.drawContours(img, contours, 0, (0,255,0), 3)


cv2.imshow('ct',img)
cv2.imwrite("ct.jpg",img)


cv2.waitKey(0)
cv2.destroyAllWindows()
