package p204p;

import android.graphics.Bitmap;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes10.dex */
public final class fq9 {

    /* JADX INFO: renamed from: a */
    public final e940 f72107a;

    /* JADX INFO: renamed from: b */
    public final ei9 f72108b;

    public /* synthetic */ fq9(ei9 ei9Var, e940 e940Var) {
        this.f72107a = e940Var;
        this.f72108b = ei9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m42402a(ibk ibkVar) {
        dq9 dq9Var;
        Object c6x0Var;
        if (ibkVar instanceof dq9) {
            dq9Var = (dq9) ibkVar;
            int i = dq9Var.f51908c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq9Var.f51908c = i - Integer.MIN_VALUE;
            } else {
                dq9Var = new dq9(this, ibkVar);
            }
        } else {
            dq9Var = new dq9(this, ibkVar);
        }
        Object objM96567o = dq9Var.f51906a;
        int i2 = dq9Var.f51908c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                lxe lxeVarMo24613j = this.f72107a.mo24613j(bm51.m29801l0("https://sharing-assets.spotifycdn.com/SongDNA/{index}.png", "{index}", String.valueOf(n0e1.m63402J(new b450(1, 4, 1), w4u0.f247890a))));
                lxeVarMo24613j.f137801g = false;
                Single singleM60183i = lxeVarMo24613j.m60183i();
                dq9Var.f51908c = 1;
                objM96567o = zn91.m96567o(singleM60183i, dq9Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            c6x0Var = (Bitmap) objM96567o;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        Bitmap bitmap = (Bitmap) c6x0Var;
        if (bitmap == null) {
            return null;
        }
        return new eq9(this, bitmap);
    }
}
