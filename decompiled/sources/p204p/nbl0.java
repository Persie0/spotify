package p204p;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nbl0 implements Parcelable {
    /* JADX INFO: renamed from: c */
    public abstract j3r mo50186c();

    /* JADX INFO: renamed from: g */
    public abstract w9j0 mo50187g();

    /* JADX INFO: renamed from: h */
    public final fq01 m64098h() {
        if (this instanceof lbl0) {
            return up01.f232548d;
        }
        if (this instanceof jbl0) {
            return kp01.f124948d;
        }
        if (this instanceof kbl0) {
            return rp01.f201396d;
        }
        if (this instanceof ibl0) {
            return fp01.f71659d;
        }
        if (this instanceof mbl0) {
            return bq01.f29640d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
