package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class vum0 extends ww41 implements Parcelable, ab31, kqi0, rv41 {
    public static final Parcelable.Creator<vum0> CREATOR = new luh0(5);

    /* JADX INFO: renamed from: b */
    public ya31 f245027b;

    public vum0(int i) {
        oa31 oa31VarM82674j = ua31.m82674j();
        ya31 ya31Var = new ya31(i, oa31VarM82674j.mo28818g());
        if (!(oa31VarM82674j instanceof sg10)) {
            ya31Var.f20764b = new ya31(i, 1);
        }
        this.f245027b = ya31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.rv41
    public Object getValue() {
        return Integer.valueOf(m86437v());
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: h */
    public final gh00 mo57113h() {
        return new wa31(this, 1);
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f245027b;
    }

    @Override // p204p.ab31
    /* JADX INFO: renamed from: k */
    public final cb31 mo25318k() {
        return tjr0.f220989Q0;
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: l */
    public final Object mo57114l() {
        return Integer.valueOf(m86437v());
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        this.f245027b = (ya31) ax41Var;
    }

    @Override // p204p.kqi0
    public void setValue(Object obj) {
        m86438w(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((ya31) ua31.m82672h(this.f245027b)).f270768c + ")@" + hashCode();
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: u */
    public final ax41 mo63800u(ax41 ax41Var, ax41 ax41Var2, ax41 ax41Var3) {
        if (((ya31) ax41Var2).f270768c == ((ya31) ax41Var3).f270768c) {
            return ax41Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final int m86437v() {
        return ((ya31) ua31.m82684t(this.f245027b, this)).f270768c;
    }

    /* JADX INFO: renamed from: w */
    public final void m86438w(int i) {
        oa31 oa31VarM82674j;
        ya31 ya31Var = (ya31) ua31.m82672h(this.f245027b);
        if (ya31Var.f270768c != i) {
            ya31 ya31Var2 = this.f245027b;
            synchronized (ua31.f228351c) {
                oa31VarM82674j = ua31.m82674j();
                ((ya31) ua31.m82679o(ya31Var2, this, oa31VarM82674j, ya31Var)).f270768c = i;
            }
            ua31.m82678n(oa31VarM82674j, this);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(m86437v());
    }
}
