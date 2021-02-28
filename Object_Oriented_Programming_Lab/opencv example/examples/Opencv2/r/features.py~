import numpy as np
import cv2
from matplotlib import pyplot as plt


img=cv2.imread('r.jpg',0)
cv2.imshow('img',img)

edges = cv2.Canny(img,100,200)
cv2.imshow('edges',edges)
cv2.imwrite('edges.jpg',edges)

plt.subplot(121),plt.imshow(img,cmap = 'gray')
plt.title('Original Image'), plt.xticks([]), plt.yticks([])
plt.subplot(122),plt.imshow(edges,cmap = 'gray')
plt.title('Edge Image'), plt.xticks([]), plt.yticks([])

plt.show()


cv2.waitKey(0)
cv2.destroyAllWindows()

