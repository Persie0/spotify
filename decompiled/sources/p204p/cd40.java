package p204p;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;

/* JADX INFO: loaded from: classes5.dex */
public final class cd40 implements ImageDecoder$OnHeaderDecodedListener {
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i;
        imageDecoder.setAllocator(1);
        int iMax = Math.max(imageInfo.getSize().getWidth(), imageInfo.getSize().getHeight());
        if (iMax <= 3072) {
            i = 1;
        } else {
            i = 1;
            while (iMax / i > 3072) {
                i *= 2;
            }
        }
        if (i > 1) {
            imageDecoder.setTargetSampleSize(i);
        }
        imageInfo.getSize().getWidth();
        imageInfo.getSize().getHeight();
    }
}
