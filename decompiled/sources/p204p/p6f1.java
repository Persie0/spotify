package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p6f1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f174387l;

    /* JADX INFO: renamed from: m */
    public final ev61 f174388m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ k8f1 f174389n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6f1(k8f1 k8f1Var, ev61 ev61Var, int i) {
        super("com.google.android.engage.protocol.IAppEngageServicePublishStatusCallback", 5);
        this.f174387l = i;
        switch (i) {
            case 1:
                this.f174389n = k8f1Var;
                super("com.google.android.engage.protocol.IAppEngageServiceAvailableCallback", 5);
                this.f174388m = ev61Var;
                break;
            case 2:
                this.f174389n = k8f1Var;
                super("com.google.android.engage.protocol.IAppEngageServiceDeleteClustersCallback", 5);
                this.f174388m = ev61Var;
                break;
            case 3:
                this.f174389n = k8f1Var;
                super("com.google.android.engage.protocol.IAppEngageServicePublishClustersCallback", 5);
                this.f174388m = ev61Var;
                break;
            default:
                this.f174389n = k8f1Var;
                this.f174388m = ev61Var;
                break;
        }
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: C */
    public final boolean mo57436C(int i, Parcel parcel) {
        switch (this.f174387l) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) hmf1.m47970a(parcel);
                hmf1.m47971b(parcel);
                dsg1 dsg1Var = this.f174389n.f120363e;
                ev61 ev61Var = this.f174388m;
                if (dsg1Var != null) {
                    dsg1Var.m36774e(ev61Var);
                }
                ev61Var.m40099d(bundle);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) hmf1.m47970a(parcel);
                hmf1.m47971b(parcel);
                dsg1 dsg1Var2 = this.f174389n.f120363e;
                ev61 ev61Var2 = this.f174388m;
                if (dsg1Var2 != null) {
                    dsg1Var2.m36774e(ev61Var2);
                }
                ev61Var2.m40099d(bundle2);
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) hmf1.m47970a(parcel);
                hmf1.m47971b(parcel);
                dsg1 dsg1Var3 = this.f174389n.f120363e;
                ev61 ev61Var3 = this.f174388m;
                if (dsg1Var3 != null) {
                    dsg1Var3.m36774e(ev61Var3);
                }
                ev61Var3.m40099d(bundle3);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) hmf1.m47970a(parcel);
                hmf1.m47971b(parcel);
                dsg1 dsg1Var4 = this.f174389n.f120363e;
                ev61 ev61Var4 = this.f174388m;
                if (dsg1Var4 != null) {
                    dsg1Var4.m36774e(ev61Var4);
                }
                ev61Var4.m40099d(bundle4);
                return true;
        }
    }
}
