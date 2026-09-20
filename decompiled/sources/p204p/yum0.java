package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class yum0 extends ww41 implements Parcelable, ab31 {
    public static final Parcelable.Creator<yum0> CREATOR = new xum0(0);

    /* JADX INFO: renamed from: b */
    public final cb31 f276420b;

    /* JADX INFO: renamed from: c */
    public bb31 f276421c;

    public yum0(Object obj, cb31 cb31Var) {
        this.f276420b = cb31Var;
        oa31 oa31VarM82674j = ua31.m82674j();
        bb31 bb31Var = new bb31(oa31VarM82674j.mo28818g(), obj);
        if (!(oa31VarM82674j instanceof sg10)) {
            bb31Var.f20764b = new bb31(1, obj);
        }
        this.f276421c = bb31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.rv41
    public final Object getValue() {
        return ((bb31) ua31.m82684t(this.f276421c, this)).f25424c;
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: h */
    public final gh00 mo57113h() {
        return new wa31(this, 3);
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f276421c;
    }

    @Override // p204p.ab31
    /* JADX INFO: renamed from: k */
    public final cb31 mo25318k() {
        return this.f276420b;
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: l */
    public final Object mo57114l() {
        return getValue();
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        this.f276421c = (bb31) ax41Var;
    }

    @Override // p204p.kqi0
    public final void setValue(Object obj) {
        oa31 oa31VarM82674j;
        bb31 bb31Var = (bb31) ua31.m82672h(this.f276421c);
        if (this.f276420b.mo32148p(bb31Var.f25424c, obj)) {
            return;
        }
        bb31 bb31Var2 = this.f276421c;
        synchronized (ua31.f228351c) {
            oa31VarM82674j = ua31.m82674j();
            ((bb31) ua31.m82679o(bb31Var2, this, oa31VarM82674j, bb31Var)).f25424c = obj;
        }
        ua31.m82678n(oa31VarM82674j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((bb31) ua31.m82672h(this.f276421c)).f25424c + ")@" + hashCode();
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: u */
    public final ax41 mo63800u(ax41 ax41Var, ax41 ax41Var2, ax41 ax41Var3) {
        if (this.f276420b.mo32148p(((bb31) ax41Var2).f25424c, ((bb31) ax41Var3).f25424c)) {
            return ax41Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        cb31 cb31VarMo25318k = mo25318k();
        if (wj50.m88271j(cb31VarMo25318k, zhi0.f282936c)) {
            i2 = 0;
        } else if (wj50.m88271j(cb31VarMo25318k, tjr0.f220989Q0)) {
            i2 = 1;
        } else {
            if (!wj50.m88271j(cb31VarMo25318k, kxq0.f127575g)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
