import numpy as np
import cv2


nm="74.jpg"
img=cv2.imread(nm)
cv2.imshow('img',img)


img = cv2.GaussianBlur(img,(9,9),0)


hsv=cv2.cvtColor(img,cv2.COLOR_BGR2HSV)
lr= np.array([160,50,50])
ur= np.array([180,255,255])
th = cv2.inRange(hsv, lr, ur)

cv2.imshow('red',th)
cv2.imwrite('detected.jpg',th)



cimg = img

circles = cv2.HoughCircles(img,cv2.HOUGH_GRADIENT,1,20,
                            param1=50,param2=30,minRadius=0,maxRadius=0)

circles = np.uint16(np.around(circles))
for i in circles[0,:]:
    # draw the outer circle
    cv2.circle(cimg,(i[0],i[1]),i[2],(0,255,0),2)
    # draw the center of the circle
    cv2.circle(cimg,(i[0],i[1]),2,(0,0,255),3)

cv2.imshow('detected circles',cimg)


cv2.waitKey(0)
cv2.destroyAllWindows()

