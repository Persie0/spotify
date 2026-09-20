package p204p;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class qh9 implements tty {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188690a;

    /* JADX INFO: renamed from: b */
    public final ivl0 f188691b;

    /* JADX INFO: renamed from: c */
    public final Object f188692c;

    public /* synthetic */ qh9(Object obj, ivl0 ivl0Var, int i) {
        this.f188690a = i;
        this.f188692c = obj;
        this.f188691b = ivl0Var;
    }

    @Override // p204p.tty
    /* JADX INFO: renamed from: a */
    public final Object mo25711a(fbk fbkVar) {
        int i = this.f188690a;
        Object obj = this.f188692c;
        ivl0 ivl0Var = this.f188691b;
        switch (i) {
            case 0:
                return new r540(ufc1.m82967e(new BitmapDrawable(ivl0Var.f106232a.getResources(), (Bitmap) obj)), false, 2);
            case 1:
                npa npaVar = new npa();
                byte[] bArr = (byte[]) obj;
                npaVar.write(bArr, 0, bArr.length);
                return new fu31(bga.m29082d(npaVar, ivl0Var.f106237f), null, 2);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new fu31(new hu31(new vuu0(new lua(byteBuffer)), ivl0Var.f106237f, new mua(byteBuffer)), null, 2);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = h1b1.f86551a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof z4b1);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(ivl0Var.f106232a.getResources(), epv0.m39691k(bitmapDrawable, zb40.m95822a(ivl0Var), ivl0Var.f106233b, ivl0Var.f106234c, ivl0Var.f106235d == 2));
                }
                return new r540(ufc1.m82967e(bitmapDrawable), z, 2);
        }
    }
}
