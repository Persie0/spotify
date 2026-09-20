package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.edb;
import p204p.epv0;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.hrh;
import p204p.klh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.ql51;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.utz0;
import p204p.vwp0;
import p204p.wj50;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0081\b\u0018\u0000 R2\u00020\u0001:\u0002STB\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010+J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b9\u0010:\u001a\u0004\b6\u0010-\"\u0004\b7\u00108R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b?\u0010:\u001a\u0004\b \u0010=\"\u0004\b \u0010>R*\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u00105\u0012\u0004\bB\u0010:\u001a\u0004\bA\u0010-\"\u0004\b6\u00108R*\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u00105\u0012\u0004\bE\u0010:\u001a\u0004\bD\u0010-\"\u0004\b \u00108R*\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bK\u0010:\u001a\u0004\bH\u0010I\"\u0004\b \u0010JR*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bQ\u0010:\u001a\u0004\bN\u0010O\"\u0004\b \u0010P¨\u0006U"}, m24212d2 = {"Lcom/ravelin/core/model/Payload;", "Landroid/os/Parcelable;", "", "libVer", "appVer", "deviceId", "fingerprintSource", "ravelinSessionId", "customerId", "tempCustomerId", "Lcom/ravelin/core/model/Fingerprint;", "android", "error", "orderId", "eventType", "Lcom/ravelin/core/model/EventData;", "eventData", "Lcom/ravelin/core/model/EventMeta;", "eventMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Fingerprint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/EventData;Lcom/ravelin/core/model/EventMeta;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Fingerprint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/EventData;Lcom/ravelin/core/model/EventMeta;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "lpt2", "(Lcom/ravelin/core/model/Payload;Lp/hrh;Lp/ktz0;)V", "Lcom/ravelin/core/model/ResponsePayload;", "COM7", "()Lcom/ravelin/core/model/ResponsePayload;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "Lpt5", "setDeviceId", "(Ljava/lang/String;)V", "getDeviceId$annotations", "()V", "h", "Lcom/ravelin/core/model/Fingerprint;", "()Lcom/ravelin/core/model/Fingerprint;", "(Lcom/ravelin/core/model/Fingerprint;)V", "getAndroid$annotations", "t", "getOrderId", "getOrderId$annotations", "X", "getEventType", "getEventType$annotations", "Y", "Lcom/ravelin/core/model/EventData;", "getEventData", "()Lcom/ravelin/core/model/EventData;", "(Lcom/ravelin/core/model/EventData;)V", "getEventData$annotations", "Z", "Lcom/ravelin/core/model/EventMeta;", "getEventMeta", "()Lcom/ravelin/core/model/EventMeta;", "(Lcom/ravelin/core/model/EventMeta;)V", "getEventMeta$annotations", "Companion", "cOm9", "CoM4", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class Payload implements Parcelable {

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String eventType;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public EventData eventData;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public EventMeta eventMeta;

    /* JADX INFO: renamed from: a */
    public final String f2614a;

    /* JADX INFO: renamed from: b */
    public final String f2615b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String deviceId;

    /* JADX INFO: renamed from: d */
    public final String f2617d;

    /* JADX INFO: renamed from: e */
    public final String f2618e;

    /* JADX INFO: renamed from: f */
    public final String f2619f;

    /* JADX INFO: renamed from: g */
    public final String f2620g;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Fingerprint android;

    /* JADX INFO: renamed from: i */
    public final String f2622i;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public String orderId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Payload> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.Payload$CoM4, reason: from kotlin metadata */
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
        public final Payload createFromParcel(Parcel parcel) {
            return new Payload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Fingerprint.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EventData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EventMeta.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Payload[] newArray(int i) {
            return new Payload[i];
        }
    }

    public /* synthetic */ class cOm9 implements g210 {

        /* JADX INFO: renamed from: a */
        public static final vwp0 f2624a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            vwp0 vwp0Var = new vwp0("com.ravelin.core.model.Payload", com9, 13);
            vwp0Var.m86594k("libVer", true);
            vwp0Var.m86594k("appVer", true);
            vwp0Var.m86594k("deviceId", true);
            vwp0Var.m86594k("fingerprintSource", true);
            vwp0Var.m86594k("ravelinSessionId", true);
            vwp0Var.m86594k("customerId", true);
            vwp0Var.m86594k("tempCustomerId", true);
            vwp0Var.m86594k("android", true);
            vwp0Var.m86594k("error", true);
            vwp0Var.m86594k("orderId", true);
            vwp0Var.m86594k("eventType", true);
            vwp0Var.m86594k("eventData", true);
            vwp0Var.m86594k("eventMeta", true);
            f2624a = vwp0Var;
        }

        @Override // p204p.g210
        public final rr60[] childSerializers() {
            ql51 ql51Var = ql51.f189738a;
            return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(Fingerprint.cOm9.lpt2), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(EventData.cOm9.lpt2), epv0.m39700t(EventMeta.cOm9.lpt2)};
        }

        @Override // p204p.rr60
        public final ktz0 getDescriptor() {
            return f2624a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Payload deserialize(fro froVar) {
            vwp0 vwp0Var = f2624a;
            frh frhVarMo29814b = froVar.mo29814b(vwp0Var);
            frhVarMo29814b.getClass();
            String str = null;
            EventMeta eventMeta = null;
            String str2 = null;
            EventData eventData = null;
            String strMo39226f = null;
            String strMo39226f2 = null;
            String strMo39226f3 = null;
            String strMo39226f4 = null;
            String strMo39226f5 = null;
            String str3 = null;
            String str4 = null;
            Fingerprint fingerprint = null;
            String str5 = null;
            int i = 0;
            boolean z = true;
            while (true) {
                String str6 = strMo39226f;
                if (!z) {
                    frhVarMo29814b.mo29813a(vwp0Var);
                    return new Payload(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, str3, str4, fingerprint, str5, str, str2, eventData, eventMeta, (utz0) null);
                }
                int iMo29816p = frhVarMo29814b.mo29816p(vwp0Var);
                switch (iMo29816p) {
                    case -1:
                        z = false;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 0:
                        strMo39226f2 = strMo39226f2;
                        i |= 1;
                        strMo39226f = frhVarMo29814b.mo39226f(vwp0Var, 0);
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 1:
                        strMo39226f2 = frhVarMo29814b.mo39226f(vwp0Var, 1);
                        i |= 2;
                        strMo39226f = str6;
                        break;
                    case 2:
                        strMo39226f3 = frhVarMo29814b.mo39226f(vwp0Var, 2);
                        i |= 4;
                        strMo39226f = str6;
                        break;
                    case 3:
                        strMo39226f4 = frhVarMo29814b.mo39226f(vwp0Var, 3);
                        i |= 8;
                        strMo39226f = str6;
                        break;
                    case 4:
                        strMo39226f5 = frhVarMo29814b.mo39226f(vwp0Var, 4);
                        i |= 16;
                        strMo39226f = str6;
                        break;
                    case 5:
                        str3 = (String) frhVarMo29814b.mo39211B(vwp0Var, 5, ql51.f189738a, str3);
                        i |= 32;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 6:
                        str4 = (String) frhVarMo29814b.mo39211B(vwp0Var, 6, ql51.f189738a, str4);
                        i |= 64;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 7:
                        fingerprint = (Fingerprint) frhVarMo29814b.mo39211B(vwp0Var, 7, Fingerprint.cOm9.lpt2, fingerprint);
                        i |= 128;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 8:
                        str5 = (String) frhVarMo29814b.mo39211B(vwp0Var, 8, ql51.f189738a, str5);
                        i |= 256;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 9:
                        str = (String) frhVarMo29814b.mo39211B(vwp0Var, 9, ql51.f189738a, str);
                        i |= 512;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 10:
                        str2 = (String) frhVarMo29814b.mo39211B(vwp0Var, 10, ql51.f189738a, str2);
                        i |= 1024;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 11:
                        eventData = (EventData) frhVarMo29814b.mo39211B(vwp0Var, 11, EventData.cOm9.lpt2, eventData);
                        i |= 2048;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    case 12:
                        eventMeta = (EventMeta) frhVarMo29814b.mo39211B(vwp0Var, 12, EventMeta.cOm9.lpt2, eventMeta);
                        i |= 4096;
                        strMo39226f = str6;
                        strMo39226f2 = strMo39226f2;
                        break;
                    default:
                        throw new UnknownFieldException(iMo29816p);
                }
            }
        }

        @Override // p204p.g210
        public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
            return kvf1.f126859a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(deu deuVar, Payload payload) {
            vwp0 vwp0Var = f2624a;
            hrh hrhVarMo35820b = deuVar.mo35820b(vwp0Var);
            Payload.lpt2(payload, hrhVarMo35820b, vwp0Var);
            hrhVarMo35820b.mo44937a(vwp0Var);
        }
    }

    public /* synthetic */ Payload(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Fingerprint fingerprint, String str8, String str9, String str10, EventData eventData, EventMeta eventMeta, utz0 utz0Var) {
        if ((i & 1) == 0) {
            this.f2614a = "";
        } else {
            this.f2614a = str;
        }
        if ((i & 2) == 0) {
            this.f2615b = "";
        } else {
            this.f2615b = str2;
        }
        if ((i & 4) == 0) {
            this.deviceId = "";
        } else {
            this.deviceId = str3;
        }
        if ((i & 8) == 0) {
            this.f2617d = "";
        } else {
            this.f2617d = str4;
        }
        if ((i & 16) == 0) {
            this.f2618e = "";
        } else {
            this.f2618e = str5;
        }
        if ((i & 32) == 0) {
            this.f2619f = null;
        } else {
            this.f2619f = str6;
        }
        if ((i & 64) == 0) {
            this.f2620g = null;
        } else {
            this.f2620g = str7;
        }
        if ((i & 128) == 0) {
            this.android = null;
        } else {
            this.android = fingerprint;
        }
        if ((i & 256) == 0) {
            this.f2622i = null;
        } else {
            this.f2622i = str8;
        }
        if ((i & 512) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str9;
        }
        if ((i & 1024) == 0) {
            this.eventType = null;
        } else {
            this.eventType = str10;
        }
        if ((i & 2048) == 0) {
            this.eventData = null;
        } else {
            this.eventData = eventData;
        }
        if ((i & 4096) == 0) {
            this.eventMeta = null;
        } else {
            this.eventMeta = eventMeta;
        }
    }

    public static final /* synthetic */ void lpt2(Payload self, hrh output, ktz0 serialDesc) {
        if (output.mo48399d0() || !wj50.m88271j(self.f2614a, "")) {
            output.mo44931G(serialDesc, 0, self.f2614a);
        }
        if (output.mo48399d0() || !wj50.m88271j(self.f2615b, "")) {
            output.mo44931G(serialDesc, 1, self.f2615b);
        }
        if (output.mo48399d0() || !wj50.m88271j(self.deviceId, "")) {
            output.mo44931G(serialDesc, 2, self.deviceId);
        }
        if (output.mo48399d0() || !wj50.m88271j(self.f2617d, "")) {
            output.mo44931G(serialDesc, 3, self.f2617d);
        }
        if (output.mo48399d0() || !wj50.m88271j(self.f2618e, "")) {
            output.mo44931G(serialDesc, 4, self.f2618e);
        }
        if (output.mo48399d0() || self.f2619f != null) {
            output.mo44943s(serialDesc, 5, ql51.f189738a, self.f2619f);
        }
        if (output.mo48399d0() || self.f2620g != null) {
            output.mo44943s(serialDesc, 6, ql51.f189738a, self.f2620g);
        }
        if (output.mo48399d0() || self.android != null) {
            output.mo44943s(serialDesc, 7, Fingerprint.cOm9.lpt2, self.android);
        }
        if (output.mo48399d0() || self.f2622i != null) {
            output.mo44943s(serialDesc, 8, ql51.f189738a, self.f2622i);
        }
        if (output.mo48399d0() || self.orderId != null) {
            output.mo44943s(serialDesc, 9, ql51.f189738a, self.orderId);
        }
        if (output.mo48399d0() || self.eventType != null) {
            output.mo44943s(serialDesc, 10, ql51.f189738a, self.eventType);
        }
        if (output.mo48399d0() || self.eventData != null) {
            output.mo44943s(serialDesc, 11, EventData.cOm9.lpt2, self.eventData);
        }
        if (!output.mo48399d0() && self.eventMeta == null) {
            return;
        }
        output.mo44943s(serialDesc, 12, EventMeta.cOm9.lpt2, self.eventMeta);
    }

    public final ResponsePayload COM7() {
        return new ResponsePayload(this.f2614a, this.f2615b, this.deviceId, this.f2619f, this.f2620g, this.android, this.eventType);
    }

    /* JADX INFO: renamed from: Lpt5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) other;
        return wj50.m88271j(this.f2614a, payload.f2614a) && wj50.m88271j(this.f2615b, payload.f2615b) && wj50.m88271j(this.deviceId, payload.deviceId) && wj50.m88271j(this.f2617d, payload.f2617d) && wj50.m88271j(this.f2618e, payload.f2618e) && wj50.m88271j(this.f2619f, payload.f2619f) && wj50.m88271j(this.f2620g, payload.f2620g) && wj50.m88271j(this.android, payload.android) && wj50.m88271j(this.f2622i, payload.f2622i) && wj50.m88271j(this.orderId, payload.orderId) && wj50.m88271j(this.eventType, payload.eventType) && wj50.m88271j(this.eventData, payload.eventData) && wj50.m88271j(this.eventMeta, payload.eventMeta);
    }

    public int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f2614a.hashCode() * 31, 31, this.f2615b), 31, this.deviceId), 31, this.f2617d), 31, this.f2618e);
        String str = this.f2619f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2620g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Fingerprint fingerprint = this.android;
        int iHashCode3 = (iHashCode2 + (fingerprint == null ? 0 : fingerprint.hashCode())) * 31;
        String str3 = this.f2622i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EventData eventData = this.eventData;
        int iHashCode7 = (iHashCode6 + (eventData == null ? 0 : eventData.hashCode())) * 31;
        EventMeta eventMeta = this.eventMeta;
        return iHashCode7 + (eventMeta != null ? eventMeta.hashCode() : 0);
    }

    public String toString() {
        Fingerprint fingerprint = this.android;
        String str = this.orderId;
        String str2 = this.eventType;
        EventData eventData = this.eventData;
        EventMeta eventMeta = this.eventMeta;
        StringBuilder sbM38573v = edb.m38573v("Payload(libVer=", this.f2614a, ", appVer=", this.f2615b, ", deviceId=");
        klh.m56844p(sbM38573v, this.deviceId, ", fingerprintSource=", this.f2617d, ", ravelinSessionId=");
        klh.m56844p(sbM38573v, this.f2618e, ", customerId=", this.f2619f, ", tempCustomerId=");
        sbM38573v.append(this.f2620g);
        sbM38573v.append(", android=");
        sbM38573v.append(fingerprint);
        sbM38573v.append(", error=");
        klh.m56844p(sbM38573v, this.f2622i, ", orderId=", str, ", eventType=");
        sbM38573v.append(str2);
        sbM38573v.append(", eventData=");
        sbM38573v.append(eventData);
        sbM38573v.append(", eventMeta=");
        sbM38573v.append(eventMeta);
        sbM38573v.append(")");
        return sbM38573v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f2614a);
        dest.writeString(this.f2615b);
        dest.writeString(this.deviceId);
        dest.writeString(this.f2617d);
        dest.writeString(this.f2618e);
        dest.writeString(this.f2619f);
        dest.writeString(this.f2620g);
        Fingerprint fingerprint = this.android;
        if (fingerprint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fingerprint.writeToParcel(dest, flags);
        }
        dest.writeString(this.f2622i);
        dest.writeString(this.orderId);
        dest.writeString(this.eventType);
        EventData eventData = this.eventData;
        if (eventData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventData.writeToParcel(dest, flags);
        }
        EventMeta eventMeta = this.eventMeta;
        if (eventMeta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventMeta.writeToParcel(dest, flags);
        }
    }

    public final void Lpt5(String str) {
        this.orderId = str;
    }

    /* JADX INFO: renamed from: lpt2, reason: from getter */
    public final Fingerprint getAndroid() {
        return this.android;
    }

    public final void lpt2(Fingerprint fingerprint) {
        this.android = fingerprint;
    }

    public final void lpt2(String str) {
        this.eventType = str;
    }

    public final void lpt2(EventData eventData) {
        this.eventData = eventData;
    }

    public final void lpt2(EventMeta eventMeta) {
        this.eventMeta = eventMeta;
    }

    public Payload(String str, String str2, String str3, String str4, String str5, String str6, String str7, Fingerprint fingerprint, String str8, String str9, String str10, EventData eventData, EventMeta eventMeta) {
        this.f2614a = str;
        this.f2615b = str2;
        this.deviceId = str3;
        this.f2617d = str4;
        this.f2618e = str5;
        this.f2619f = str6;
        this.f2620g = str7;
        this.android = fingerprint;
        this.f2622i = str8;
        this.orderId = str9;
        this.eventType = str10;
        this.eventData = eventData;
        this.eventMeta = eventMeta;
    }

    public /* synthetic */ Payload(String str, String str2, String str3, String str4, String str5, String str6, String str7, Fingerprint fingerprint, String str8, String str9, String str10, EventData eventData, EventMeta eventMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : fingerprint, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : eventData, (i & 4096) != 0 ? null : eventMeta);
    }
}
