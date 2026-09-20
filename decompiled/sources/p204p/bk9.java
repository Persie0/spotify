package p204p;

import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes5.dex */
public final class bk9 implements z8l {

    /* JADX INFO: renamed from: c */
    public static final String f27865c = xoc1.f264066d3.f243453a;

    /* JADX INFO: renamed from: a */
    public final qwx0 f27866a;

    /* JADX INFO: renamed from: b */
    public final a99 f27867b;

    public bk9(qwx0 qwx0Var, a99 a99Var) {
        this.f27866a = qwx0Var;
        this.f27867b = a99Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r1 == r7) goto L23;
     */
    @Override // p204p.z8l
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo27514a(n8l n8lVar, fbk fbkVar) {
        ak9 ak9Var;
        if (fbkVar instanceof ak9) {
            ak9Var = (ak9) fbkVar;
            int i = ak9Var.f16464c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ak9Var.f16464c = i - Integer.MIN_VALUE;
            } else {
                ak9Var = new ak9(this, (ibk) fbkVar);
            }
        } else {
            ak9Var = new ak9(this, (ibk) fbkVar);
        }
        Object objM96571q = ak9Var.f16462a;
        int i2 = ak9Var.f16464c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable map = ((rwx0) this.f27866a).f203428a.map(b5v.f23720Z);
            ak9Var.f16464c = 1;
            objM96571q = zn91.m96571q(map, 1, null, ak9Var);
            if (objM96571q != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM96571q);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96571q);
        }
        if (!((Boolean) objM96571q).booleanValue()) {
            return new j8l(unu.f232263c, new Integer(R.string.create_menu_item_blend_title), null, new Integer(R.string.create_menu_item_blend_description), null, null, null, 1, new h8l(f27865c), 476);
        }
        return null;
        if (((Boolean) objM96571q).booleanValue()) {
            ak9Var.f16464c = 2;
            objM96571q = this.f27867b.m25086b(ak9Var);
        }
        return null;
    }
}
