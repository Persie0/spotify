package p204p;

import android.media.MediaCodec;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class euf implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f62971b;

    public /* synthetic */ euf(Object obj, int i) {
        this.f62970a = i;
        this.f62971b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f62970a) {
            case 0:
                for (gh00 gh00Var : (gh00[]) this.f62971b) {
                    int iM53703m = jlg1.m53703m((Comparable) gh00Var.invoke(obj), (Comparable) gh00Var.invoke(obj2));
                    if (iM53703m != 0) {
                        return iM53703m;
                    }
                }
                return 0;
            case 1:
                yad0 yad0Var = (yad0) this.f62971b;
                return yad0Var.mo87593c(obj2) - yad0Var.mo87593c(obj);
            case 2:
                return ((Number) ((th00) this.f62971b).invoke(obj, obj2)).intValue();
            default:
                c28 c28Var = (c28) obj2;
                ((mwt0) this.f62971b).getClass();
                Class cls = ((c28) obj).f33314a.f144314j;
                int i = 1;
                int i2 = cls == MediaCodec.class ? 2 : cls == g4r0.class ? 0 : 1;
                Class cls2 = c28Var.f33314a.f144314j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == g4r0.class) {
                    i = 0;
                }
                return i2 - i;
        }
    }
}
