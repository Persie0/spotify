package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.edb;
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
@Metadata(m24211d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&¨\u0006*"}, m24212d2 = {"Lcom/ravelin/core/model/SharedPackages;", "Landroid/os/Parcelable;", "", "libVer", "platform", "appPackageName", "appVersion", "", "sharedAppPackages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "lpt2", "(Lcom/ravelin/core/model/SharedPackages;Lp/hrh;Lp/ktz0;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class SharedPackages implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f2648a;

    /* JADX INFO: renamed from: b */
    public final String f2649b;

    /* JADX INFO: renamed from: c */
    public final String f2650c;

    /* JADX INFO: renamed from: d */
    public final String f2651d;

    /* JADX INFO: renamed from: e */
    public final List f2652e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SharedPackages> CREATOR = new CoM6();

    /* JADX INFO: renamed from: f */
    public static final fr70[] f2647f = {null, null, null, null, q3d0.m72078I(2, new saa0(16))};

    /* JADX INFO: renamed from: com.ravelin.core.model.SharedPackages$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final rr60 serializer() {
            return cOm9.lpt2;
        }
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final SharedPackages createFromParcel(Parcel parcel) {
            return new SharedPackages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final SharedPackages[] newArray(int i) {
            return new SharedPackages[i];
        }
    }

    public /* synthetic */ class cOm9 implements g210 {

        /* JADX INFO: renamed from: a */
        public static final vwp0 f2653a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            vwp0 vwp0Var = new vwp0("com.ravelin.core.model.SharedPackages", com9, 5);
            vwp0Var.m86594k("libVer", true);
            vwp0Var.m86594k("platform", true);
            vwp0Var.m86594k("appPackageName", true);
            vwp0Var.m86594k("appVer", true);
            vwp0Var.m86594k("sharedAppPackages", true);
            f2653a = vwp0Var;
        }

        @Override // p204p.g210
        public final rr60[] childSerializers() {
            fr70[] fr70VarArr = SharedPackages.f2647f;
            ql51 ql51Var = ql51.f189738a;
            return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t((rr60) fr70VarArr[4].getValue())};
        }

        @Override // p204p.rr60
        public final ktz0 getDescriptor() {
            return f2653a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final SharedPackages deserialize(fro froVar) {
            vwp0 vwp0Var = f2653a;
            frh frhVarMo29814b = froVar.mo29814b(vwp0Var);
            fr70[] fr70VarArr = SharedPackages.f2647f;
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
            return new SharedPackages(i, str, str2, str3, str4, list, null);
        }

        @Override // p204p.g210
        public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
            return kvf1.f126859a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(deu deuVar, SharedPackages sharedPackages) {
            vwp0 vwp0Var = f2653a;
            hrh hrhVarMo35820b = deuVar.mo35820b(vwp0Var);
            SharedPackages.lpt2(sharedPackages, hrhVarMo35820b, vwp0Var);
            hrhVarMo35820b.mo44937a(vwp0Var);
        }
    }

    public /* synthetic */ SharedPackages(int i, String str, String str2, String str3, String str4, List list, utz0 utz0Var) {
        if ((i & 1) == 0) {
            this.f2648a = null;
        } else {
            this.f2648a = str;
        }
        if ((i & 2) == 0) {
            this.f2649b = null;
        } else {
            this.f2649b = str2;
        }
        if ((i & 4) == 0) {
            this.f2650c = null;
        } else {
            this.f2650c = str3;
        }
        if ((i & 8) == 0) {
            this.f2651d = null;
        } else {
            this.f2651d = str4;
        }
        if ((i & 16) == 0) {
            this.f2652e = null;
        } else {
            this.f2652e = list;
        }
    }

    public static final /* synthetic */ void lpt2(SharedPackages self, hrh output, ktz0 serialDesc) {
        if (output.mo48399d0() || self.f2648a != null) {
            output.mo44943s(serialDesc, 0, ql51.f189738a, self.f2648a);
        }
        if (output.mo48399d0() || self.f2649b != null) {
            output.mo44943s(serialDesc, 1, ql51.f189738a, self.f2649b);
        }
        if (output.mo48399d0() || self.f2650c != null) {
            output.mo44943s(serialDesc, 2, ql51.f189738a, self.f2650c);
        }
        if (output.mo48399d0() || self.f2651d != null) {
            output.mo44943s(serialDesc, 3, ql51.f189738a, self.f2651d);
        }
        if (!output.mo48399d0() && self.f2652e == null) {
            return;
        }
        output.mo44943s(serialDesc, 4, (rr60) f2647f[4].getValue(), self.f2652e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedPackages)) {
            return false;
        }
        SharedPackages sharedPackages = (SharedPackages) other;
        return wj50.m88271j(this.f2648a, sharedPackages.f2648a) && wj50.m88271j(this.f2649b, sharedPackages.f2649b) && wj50.m88271j(this.f2650c, sharedPackages.f2650c) && wj50.m88271j(this.f2651d, sharedPackages.f2651d) && wj50.m88271j(this.f2652e, sharedPackages.f2652e);
    }

    public int hashCode() {
        String str = this.f2648a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2649b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2650c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2651d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f2652e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM38573v = edb.m38573v("SharedPackages(libVer=", this.f2648a, ", platform=", this.f2649b, ", appPackageName=");
        klh.m56844p(sbM38573v, this.f2650c, ", appVersion=", this.f2651d, ", sharedAppPackages=");
        sbM38573v.append(this.f2652e);
        sbM38573v.append(")");
        return sbM38573v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f2648a);
        dest.writeString(this.f2649b);
        dest.writeString(this.f2650c);
        dest.writeString(this.f2651d);
        dest.writeStringList(this.f2652e);
    }

    public SharedPackages(String str, String str2, String str3, String str4, List list) {
        this.f2648a = str;
        this.f2649b = str2;
        this.f2650c = str3;
        this.f2651d = str4;
        this.f2652e = list;
    }
}
