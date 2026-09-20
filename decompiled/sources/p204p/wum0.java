package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wum0 extends ww41 implements Parcelable, ab31, kqi0, rv41 {
    public static final Parcelable.Creator<wum0> CREATOR = new pum0(5);

    /* JADX INFO: renamed from: b */
    public za31 f255230b;

    public wum0(long j) {
        oa31 oa31VarM82674j = ua31.m82674j();
        za31 za31Var = new za31(oa31VarM82674j.mo28818g(), j);
        if (!(oa31VarM82674j instanceof sg10)) {
            za31Var.f20764b = new za31(1, j);
        }
        this.f255230b = za31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.rv41
    public Object getValue() {
        return Long.valueOf(m89067v());
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: h */
    public final gh00 mo57113h() {
        return new wa31(this, 2);
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f255230b;
    }

    @Override // p204p.ab31
    /* JADX INFO: renamed from: k */
    public final cb31 mo25318k() {
        return tjr0.f220989Q0;
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: l */
    public final Object mo57114l() {
        return Long.valueOf(m89067v());
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        this.f255230b = (za31) ax41Var;
    }

    @Override // p204p.kqi0
    public void setValue(Object obj) {
        m89068w(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((za31) ua31.m82672h(this.f255230b)).f280978c + ")@" + hashCode();
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: u */
    public final ax41 mo63800u(ax41 ax41Var, ax41 ax41Var2, ax41 ax41Var3) {
        if (((za31) ax41Var2).f280978c == ((za31) ax41Var3).f280978c) {
            return ax41Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final long m89067v() {
        return ((za31) ua31.m82684t(this.f255230b, this)).f280978c;
    }

    /* JADX INFO: renamed from: w */
    public final void m89068w(long j) {
        oa31 oa31VarM82674j;
        za31 za31Var = (za31) ua31.m82672h(this.f255230b);
        if (za31Var.f280978c != j) {
            za31 za31Var2 = this.f255230b;
            synchronized (ua31.f228351c) {
                oa31VarM82674j = ua31.m82674j();
                ((za31) ua31.m82679o(za31Var2, this, oa31VarM82674j, za31Var)).f280978c = j;
            }
            ua31.m82678n(oa31VarM82674j, this);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(m89067v());
    }
}
