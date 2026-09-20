package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class qjf1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<qjf1> CREATOR = new c5f1(24);

    /* JADX INFO: renamed from: a */
    public final dlf1 f189233a;

    /* JADX INFO: renamed from: b */
    public final int f189234b;

    /* JADX INFO: renamed from: c */
    public final int f189235c;

    /* JADX INFO: renamed from: d */
    public final int f189236d;

    public qjf1(dlf1 dlf1Var, int i, int i2, int i3) {
        this.f189233a = dlf1Var;
        this.f189234b = i;
        this.f189235c = i2;
        this.f189236d = i3;
    }

    /* JADX INFO: renamed from: k */
    public final void m72908k(pmc pmcVar) {
        dlf1 dlf1Var = this.f189233a;
        int i = this.f189234b;
        if (i == 1) {
            pmcVar.mo33268a(dlf1Var);
            return;
        }
        if (i == 2) {
            pmcVar.mo33269b(dlf1Var);
        } else if (i == 3) {
            pmcVar.mo33270c(dlf1Var);
        } else {
            if (i != 4) {
                return;
            }
            pmcVar.mo33271e(dlf1Var);
        }
    }

    public final String toString() {
        String string;
        String string2;
        String strValueOf = String.valueOf(this.f189233a);
        int i = this.f189234b;
        if (i == 1) {
            string = "CHANNEL_OPENED";
        } else if (i == 2) {
            string = "CHANNEL_CLOSED";
        } else if (i != 3) {
            string = i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED";
        } else {
            string = "INPUT_CLOSED";
        }
        int i2 = this.f189235c;
        if (i2 == 0) {
            string2 = "CLOSE_REASON_NORMAL";
        } else if (i2 == 1) {
            string2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i2 != 2) {
            string2 = i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE";
        } else {
            string2 = "CLOSE_REASON_REMOTE_CLOSE";
        }
        StringBuilder sbM38573v = edb.m38573v("ChannelEventParcelable[, channel=", strValueOf, ", type=", string, ", closeReason=");
        sbM38573v.append(string2);
        sbM38573v.append(", appErrorCode=");
        sbM38573v.append(this.f189236d);
        sbM38573v.append("]");
        return sbM38573v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26307M(parcel, 2, this.f189233a, i);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(this.f189234b);
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(this.f189235c);
        alf1.m26313S(parcel, 5, 4);
        parcel.writeInt(this.f189236d);
        alf1.m26316V(iM26314T, parcel);
    }
}
