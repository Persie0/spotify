package p204p;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class oh9 extends gc21 {

    /* JADX INFO: renamed from: n */
    public final Context f165375n;

    /* JADX INFO: renamed from: o */
    public final int f165376o;

    public oh9(Context context) {
        super(new iro[1], new mh9[1]);
        this.f165375n = context;
        this.f165376o = -1;
    }

    @Override // p204p.gc21
    /* JADX INFO: renamed from: f */
    public final iro mo44276f() {
        return new iro(1);
    }

    @Override // p204p.gc21
    /* JADX INFO: renamed from: g */
    public final jro mo44277g() {
        return new mh9(this);
    }

    @Override // p204p.gc21
    /* JADX INFO: renamed from: h */
    public final DecoderException mo44278h(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // p204p.gc21
    /* JADX INFO: renamed from: i */
    public final DecoderException mo44279i(iro iroVar, jro jroVar, boolean z) {
        mh9 mh9Var = (mh9) jroVar;
        ByteBuffer byteBuffer = iroVar.f105018d;
        byteBuffer.getClass();
        c95.m31855u(byteBuffer.hasArray());
        c95.m31843i(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f165376o;
            if (iMax == -1) {
                Context context = this.f165375n;
                if (context != null) {
                    Point pointM46275C = h0b1.m46275C(context);
                    int i = pointM46275C.x;
                    int i2 = pointM46275C.y;
                    r300 r300Var = iroVar.f105016b;
                    if (r300Var != null) {
                        int i3 = r300Var.f195368R;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = r300Var.f195369S;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            mh9Var.f143735d = k04.m54910g(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            mh9Var.f115242b = iroVar.f105020f;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
