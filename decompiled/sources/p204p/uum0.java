package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class uum0 extends ww41 implements Parcelable, ab31, kqi0, rv41 {
    public static final Parcelable.Creator<uum0> CREATOR = new pum0(4);

    /* JADX INFO: renamed from: b */
    public xa31 f234222b;

    public uum0(float f) {
        oa31 oa31VarM82674j = ua31.m82674j();
        xa31 xa31Var = new xa31(oa31VarM82674j.mo28818g(), f);
        if (!(oa31VarM82674j instanceof sg10)) {
            xa31Var.f20764b = new xa31(1, f);
        }
        this.f234222b = xa31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.rv41
    public Object getValue() {
        return Float.valueOf(m84031v());
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: h */
    public final gh00 mo57113h() {
        return new wa31(this, 0);
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f234222b;
    }

    @Override // p204p.ab31
    /* JADX INFO: renamed from: k */
    public final cb31 mo25318k() {
        return tjr0.f220989Q0;
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: l */
    public final Object mo57114l() {
        return Float.valueOf(m84031v());
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        this.f234222b = (xa31) ax41Var;
    }

    @Override // p204p.kqi0
    public void setValue(Object obj) {
        m84032w(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((xa31) ua31.m82672h(this.f234222b)).f259547c + ")@" + hashCode();
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: u */
    public final ax41 mo63800u(ax41 ax41Var, ax41 ax41Var2, ax41 ax41Var3) {
        if (((xa31) ax41Var2).f259547c == ((xa31) ax41Var3).f259547c) {
            return ax41Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final float m84031v() {
        return ((xa31) ua31.m82684t(this.f234222b, this)).f259547c;
    }

    /* JADX INFO: renamed from: w */
    public final void m84032w(float f) {
        oa31 oa31VarM82674j;
        xa31 xa31Var = (xa31) ua31.m82672h(this.f234222b);
        if (xa31Var.f259547c == f) {
            return;
        }
        xa31 xa31Var2 = this.f234222b;
        synchronized (ua31.f228351c) {
            oa31VarM82674j = ua31.m82674j();
            ((xa31) ua31.m82679o(xa31Var2, this, oa31VarM82674j, xa31Var)).f259547c = f;
        }
        ua31.m82678n(oa31VarM82674j, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m84031v());
    }
}
