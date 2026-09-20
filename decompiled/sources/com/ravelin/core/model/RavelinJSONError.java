package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.e450;
import p204p.edo;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.hrh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.ql51;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.u2b0;
import p204p.utz0;
import p204p.vwp0;
import p204p.wj50;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000278B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b-\u0010*\u001a\u0004\b\u0015\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010,\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001fR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010*\u001a\u0004\b3\u00104¨\u00069"}, m24212d2 = {"Lcom/ravelin/core/model/RavelinJSONError;", "Landroid/os/Parcelable;", "", "status", "", "message", "traceId", "", "timestamp", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;JLp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "lpt2", "(Lcom/ravelin/core/model/RavelinJSONError;Lp/hrh;Lp/ktz0;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Lpt5", "getStatus$annotations", "()V", "b", "Ljava/lang/String;", "getMessage$annotations", "c", "Com8", "getTraceId$annotations", "d", "J", "COM7", "()J", "getTimestamp$annotations", "Companion", "cOm9", "CoM4", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class RavelinJSONError implements Parcelable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String traceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long timestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<RavelinJSONError> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.RavelinJSONError$CoM4, reason: from kotlin metadata */
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
        public final RavelinJSONError createFromParcel(Parcel parcel) {
            return new RavelinJSONError(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final RavelinJSONError[] newArray(int i) {
            return new RavelinJSONError[i];
        }
    }

    public /* synthetic */ class cOm9 implements g210 {

        /* JADX INFO: renamed from: a */
        public static final vwp0 f2635a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            vwp0 vwp0Var = new vwp0("com.ravelin.core.model.RavelinJSONError", com9, 4);
            vwp0Var.m86594k("status", false);
            vwp0Var.m86594k("message", true);
            vwp0Var.m86594k("traceId", true);
            vwp0Var.m86594k("timestamp", false);
            f2635a = vwp0Var;
        }

        @Override // p204p.g210
        public final rr60[] childSerializers() {
            ql51 ql51Var = ql51.f189738a;
            return new rr60[]{e450.f55982a, ql51Var, ql51Var, u2b0.f226058a};
        }

        @Override // p204p.rr60
        public final ktz0 getDescriptor() {
            return f2635a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final RavelinJSONError deserialize(fro froVar) {
            vwp0 vwp0Var = f2635a;
            frh frhVarMo29814b = froVar.mo29814b(vwp0Var);
            frhVarMo29814b.getClass();
            int i = 0;
            int iMo39229o = 0;
            String strMo39226f = null;
            String strMo39226f2 = null;
            long jMo39227i0 = 0;
            boolean z = true;
            while (z) {
                int iMo29816p = frhVarMo29814b.mo29816p(vwp0Var);
                if (iMo29816p == -1) {
                    z = false;
                } else if (iMo29816p == 0) {
                    iMo39229o = frhVarMo29814b.mo39229o(vwp0Var, 0);
                    i |= 1;
                } else if (iMo29816p == 1) {
                    strMo39226f = frhVarMo29814b.mo39226f(vwp0Var, 1);
                    i |= 2;
                } else if (iMo29816p == 2) {
                    strMo39226f2 = frhVarMo29814b.mo39226f(vwp0Var, 2);
                    i |= 4;
                } else {
                    if (iMo29816p != 3) {
                        throw new UnknownFieldException(iMo29816p);
                    }
                    jMo39227i0 = frhVarMo29814b.mo39227i0(vwp0Var, 3);
                    i |= 8;
                }
            }
            frhVarMo29814b.mo29813a(vwp0Var);
            return new RavelinJSONError(i, iMo39229o, strMo39226f, strMo39226f2, jMo39227i0, (utz0) null);
        }

        @Override // p204p.g210
        public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
            return kvf1.f126859a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(deu deuVar, RavelinJSONError ravelinJSONError) {
            vwp0 vwp0Var = f2635a;
            hrh hrhVarMo35820b = deuVar.mo35820b(vwp0Var);
            RavelinJSONError.lpt2(ravelinJSONError, hrhVarMo35820b, vwp0Var);
            hrhVarMo35820b.mo44937a(vwp0Var);
        }
    }

    public /* synthetic */ RavelinJSONError(int i, int i2, String str, String str2, long j, utz0 utz0Var) {
        if (9 != (i & 9)) {
            edo.m38617p(i, 9, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.status = i2;
        if ((i & 2) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.traceId = "";
        } else {
            this.traceId = str2;
        }
        this.timestamp = j;
    }

    public static final /* synthetic */ void lpt2(RavelinJSONError self, hrh output, ktz0 serialDesc) {
        int i = self.status;
        String str = self.traceId;
        String str2 = self.message;
        output.mo44938e(0, i, serialDesc);
        if (output.mo48399d0() || !wj50.m88271j(str2, "")) {
            output.mo44931G(serialDesc, 1, str2);
        }
        if (output.mo48399d0() || !wj50.m88271j(str, "")) {
            output.mo44931G(serialDesc, 2, str);
        }
        output.mo44942l(serialDesc, 3, self.timestamp);
    }

    /* JADX INFO: renamed from: COM7, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: Com8, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* JADX INFO: renamed from: Lpt5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RavelinJSONError)) {
            return false;
        }
        RavelinJSONError ravelinJSONError = (RavelinJSONError) other;
        return this.status == ravelinJSONError.status && wj50.m88271j(this.message, ravelinJSONError.message) && wj50.m88271j(this.traceId, ravelinJSONError.traceId) && this.timestamp == ravelinJSONError.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + s571.m77243b(s571.m77243b(Integer.hashCode(this.status) * 31, 31, this.message), 31, this.traceId);
    }

    public String toString() {
        return "RavelinJSONError(status=" + this.status + ", message=" + this.message + ", traceId=" + this.traceId + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.status);
        dest.writeString(this.message);
        dest.writeString(this.traceId);
        dest.writeLong(this.timestamp);
    }

    /* JADX INFO: renamed from: lpt2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public RavelinJSONError(int i, String str, String str2, long j) {
        this.status = i;
        this.message = str;
        this.traceId = str2;
        this.timestamp = j;
    }

    public /* synthetic */ RavelinJSONError(int i, String str, String str2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, j);
    }
}
