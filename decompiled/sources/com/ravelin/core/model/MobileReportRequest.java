package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import p204p.c7h0;
import p204p.deu;
import p204p.edb;
import p204p.edo;
import p204p.epv0;
import p204p.fr70;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.hrh;
import p204p.klh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.q3d0;
import p204p.ql51;
import p204p.rr60;
import p204p.rtz0;
import p204p.saa0;
import p204p.utz0;
import p204p.vwp0;
import p204p.wj50;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u000201B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R0\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010+\"\u0004\b\u0017\u0010,¨\u00062"}, m24212d2 = {"Lcom/ravelin/core/model/MobileReportRequest;", "Landroid/os/Parcelable;", "", "libVer", "platform", "customerId", "deviceId", "", "Lcom/ravelin/core/model/MobileError;", "errors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "lpt2", "(Lcom/ravelin/core/model/MobileReportRequest;Lp/hrh;Lp/ktz0;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "(Ljava/util/List;)V", "getErrors$annotations", "()V", "Companion", "cOm9", "CoM4", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class MobileReportRequest implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f2599a;

    /* JADX INFO: renamed from: b */
    public final String f2600b;

    /* JADX INFO: renamed from: c */
    public final String f2601c;

    /* JADX INFO: renamed from: d */
    public final String f2602d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public List errors;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MobileReportRequest> CREATOR = new CoM6();

    /* JADX INFO: renamed from: f */
    public static final fr70[] f2598f = {null, null, null, null, q3d0.m72078I(2, new saa0(1))};

    /* JADX INFO: renamed from: com.ravelin.core.model.MobileReportRequest$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final rr60 serializer() {
            return cOm9.lpt2;
        }
    }

    public /* synthetic */ class cOm9 implements g210 {

        /* JADX INFO: renamed from: a */
        public static final vwp0 f2604a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            vwp0 vwp0Var = new vwp0("com.ravelin.core.model.MobileReportRequest", com9, 5);
            vwp0Var.m86594k("libVer", false);
            vwp0Var.m86594k("platform", false);
            vwp0Var.m86594k("customerId", false);
            vwp0Var.m86594k("deviceId", false);
            vwp0Var.m86594k("errors", false);
            f2604a = vwp0Var;
        }

        @Override // p204p.g210
        public final rr60[] childSerializers() {
            fr70[] fr70VarArr = MobileReportRequest.f2598f;
            ql51 ql51Var = ql51.f189738a;
            return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t((rr60) fr70VarArr[4].getValue())};
        }

        @Override // p204p.rr60
        public final ktz0 getDescriptor() {
            return f2604a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileReportRequest deserialize(fro froVar) {
            vwp0 vwp0Var = f2604a;
            frh frhVarMo29814b = froVar.mo29814b(vwp0Var);
            fr70[] fr70VarArr = MobileReportRequest.f2598f;
            frhVarMo29814b.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            boolean z = true;
            while (z) {
                int iMo29816p = frhVarMo29814b.mo29816p(vwp0Var);
                if (iMo29816p == -1) {
                    z = false;
                } else if (iMo29816p == 0) {
                    str = (String) frhVarMo29814b.mo39211B(vwp0Var, 0, ql51.f189738a, str);
                    i |= 1;
                } else if (iMo29816p == 1) {
                    str2 = (String) frhVarMo29814b.mo39211B(vwp0Var, 1, ql51.f189738a, str2);
                    i |= 2;
                } else if (iMo29816p == 2) {
                    str3 = (String) frhVarMo29814b.mo39211B(vwp0Var, 2, ql51.f189738a, str3);
                    i |= 4;
                } else if (iMo29816p == 3) {
                    str4 = (String) frhVarMo29814b.mo39211B(vwp0Var, 3, ql51.f189738a, str4);
                    i |= 8;
                } else {
                    if (iMo29816p != 4) {
                        throw new UnknownFieldException(iMo29816p);
                    }
                    list = (List) frhVarMo29814b.mo39211B(vwp0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                    i |= 16;
                }
            }
            frhVarMo29814b.mo29813a(vwp0Var);
            return new MobileReportRequest(i, str, str2, str3, str4, list, null);
        }

        @Override // p204p.g210
        public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
            return kvf1.f126859a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(deu deuVar, MobileReportRequest mobileReportRequest) {
            vwp0 vwp0Var = f2604a;
            hrh hrhVarMo35820b = deuVar.mo35820b(vwp0Var);
            MobileReportRequest.lpt2(mobileReportRequest, hrhVarMo35820b, vwp0Var);
            hrhVarMo35820b.mo44937a(vwp0Var);
        }
    }

    public /* synthetic */ MobileReportRequest(int i, String str, String str2, String str3, String str4, List list, utz0 utz0Var) {
        if (31 != (i & 31)) {
            edo.m38617p(i, 31, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.f2599a = str;
        this.f2600b = str2;
        this.f2601c = str3;
        this.f2602d = str4;
        this.errors = list;
    }

    public static final /* synthetic */ void lpt2(MobileReportRequest self, hrh output, ktz0 serialDesc) {
        ql51 ql51Var = ql51.f189738a;
        output.mo44943s(serialDesc, 0, ql51Var, self.f2599a);
        output.mo44943s(serialDesc, 1, ql51Var, self.f2600b);
        output.mo44943s(serialDesc, 2, ql51Var, self.f2601c);
        output.mo44943s(serialDesc, 3, ql51Var, self.f2602d);
        output.mo44943s(serialDesc, 4, (rr60) f2598f[4].getValue(), self.errors);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileReportRequest)) {
            return false;
        }
        MobileReportRequest mobileReportRequest = (MobileReportRequest) other;
        return wj50.m88271j(this.f2599a, mobileReportRequest.f2599a) && wj50.m88271j(this.f2600b, mobileReportRequest.f2600b) && wj50.m88271j(this.f2601c, mobileReportRequest.f2601c) && wj50.m88271j(this.f2602d, mobileReportRequest.f2602d) && wj50.m88271j(this.errors, mobileReportRequest.errors);
    }

    public int hashCode() {
        String str = this.f2599a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2600b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2601c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2602d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.errors;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        List list = this.errors;
        StringBuilder sbM38573v = edb.m38573v("MobileReportRequest(libVer=", this.f2599a, ", platform=", this.f2600b, ", customerId=");
        klh.m56844p(sbM38573v, this.f2601c, ", deviceId=", this.f2602d, ", errors=");
        sbM38573v.append(list);
        sbM38573v.append(")");
        return sbM38573v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f2599a);
        dest.writeString(this.f2600b);
        dest.writeString(this.f2601c);
        dest.writeString(this.f2602d);
        List list = this.errors;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MobileError) it.next()).writeToParcel(dest, flags);
        }
    }

    public MobileReportRequest(String str, String str2, String str3, String str4, List list) {
        this.f2599a = str;
        this.f2600b = str2;
        this.f2601c = str3;
        this.f2602d = str4;
        this.errors = list;
    }

    public final void lpt2(List list) {
        this.errors = list;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileReportRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(MobileError.CREATOR, parcel, arrayList, iM31715d, 1);
                }
            }
            return new MobileReportRequest(string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileReportRequest[] newArray(int i) {
            return new MobileReportRequest[i];
        }
    }
}
