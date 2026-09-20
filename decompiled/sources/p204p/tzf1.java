package p204p;

import android.app.Activity;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class tzf1 extends zyf1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f225239e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f225240f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ n0g1 f225241g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzf1(n0g1 n0g1Var, Activity activity, int i) {
        super(n0g1Var.f149054a, true);
        this.f225239e = i;
        switch (i) {
            case 1:
                this.f225240f = activity;
                this.f225241g = n0g1Var;
                super(n0g1Var.f149054a, true);
                break;
            case 2:
                this.f225240f = activity;
                this.f225241g = n0g1Var;
                super(n0g1Var.f149054a, true);
                break;
            case 3:
                this.f225240f = activity;
                this.f225241g = n0g1Var;
                super(n0g1Var.f149054a, true);
                break;
            default:
                this.f225240f = activity;
                this.f225241g = n0g1Var;
                break;
        }
    }

    @Override // p204p.zyf1
    /* JADX INFO: renamed from: a */
    public final void mo42856a() {
        switch (this.f225239e) {
            case 0:
                rpf1 rpf1Var = this.f225241g.f149054a.f204388f;
                ig31.m50506x(rpf1Var);
                hsf1 hsf1VarM48426k = hsf1.m48426k(this.f225240f);
                long j = this.f287581b;
                ipf1 ipf1Var = (ipf1) rpf1Var;
                Parcel parcelM51260C = ipf1Var.m51260C();
                pkf1.m70213a(parcelM51260C, hsf1VarM48426k);
                parcelM51260C.writeLong(j);
                ipf1Var.m51261v1(56, parcelM51260C);
                break;
            case 1:
                rpf1 rpf1Var2 = this.f225241g.f149054a.f204388f;
                ig31.m50506x(rpf1Var2);
                hsf1 hsf1VarM48426k2 = hsf1.m48426k(this.f225240f);
                long j2 = this.f287581b;
                ipf1 ipf1Var2 = (ipf1) rpf1Var2;
                Parcel parcelM51260C2 = ipf1Var2.m51260C();
                pkf1.m70213a(parcelM51260C2, hsf1VarM48426k2);
                parcelM51260C2.writeLong(j2);
                ipf1Var2.m51261v1(55, parcelM51260C2);
                break;
            case 2:
                rpf1 rpf1Var3 = this.f225241g.f149054a.f204388f;
                ig31.m50506x(rpf1Var3);
                hsf1 hsf1VarM48426k3 = hsf1.m48426k(this.f225240f);
                long j3 = this.f287581b;
                ipf1 ipf1Var3 = (ipf1) rpf1Var3;
                Parcel parcelM51260C3 = ipf1Var3.m51260C();
                pkf1.m70213a(parcelM51260C3, hsf1VarM48426k3);
                parcelM51260C3.writeLong(j3);
                ipf1Var3.m51261v1(52, parcelM51260C3);
                break;
            default:
                rpf1 rpf1Var4 = this.f225241g.f149054a.f204388f;
                ig31.m50506x(rpf1Var4);
                hsf1 hsf1VarM48426k4 = hsf1.m48426k(this.f225240f);
                long j4 = this.f287581b;
                ipf1 ipf1Var4 = (ipf1) rpf1Var4;
                Parcel parcelM51260C4 = ipf1Var4.m51260C();
                pkf1.m70213a(parcelM51260C4, hsf1VarM48426k4);
                parcelM51260C4.writeLong(j4);
                ipf1Var4.m51261v1(54, parcelM51260C4);
                break;
        }
    }
}
