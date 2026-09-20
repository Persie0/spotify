package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.edo;
import p204p.fr70;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.hrh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.q3d0;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.utz0;
import p204p.vwp0;
import p204p.w73;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u00060"}, m24212d2 = {"Lcom/ravelin/core/model/Events;", "Landroid/os/Parcelable;", "", "Lcom/ravelin/core/model/Payload;", "events", "<init>", "([Lcom/ravelin/core/model/Payload;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(I[Lcom/ravelin/core/model/Payload;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "lpt2", "(Lcom/ravelin/core/model/Events;Lp/hrh;Lp/ktz0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/ravelin/core/model/ResponsePayload;", "Com8", "()[Lcom/ravelin/core/model/ResponsePayload;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "", "toString", "()Ljava/lang/String;", "a", "[Lcom/ravelin/core/model/Payload;", "COM7", "()[Lcom/ravelin/core/model/Payload;", "getEvents$annotations", "()V", "Companion", "cOm9", "CoM4", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class Events implements Parcelable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Payload[] events;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Events> CREATOR = new CoM6();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f2560b = {q3d0.m72078I(2, new w73(16))};

    /* JADX INFO: renamed from: com.ravelin.core.model.Events$CoM4, reason: from kotlin metadata */
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
        public final Events createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            Payload[] payloadArr = new Payload[i];
            for (int i2 = 0; i2 != i; i2++) {
                payloadArr[i2] = Payload.CREATOR.createFromParcel(parcel);
            }
            return new Events(payloadArr);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Events[] newArray(int i) {
            return new Events[i];
        }
    }

    public /* synthetic */ class cOm9 implements g210 {

        /* JADX INFO: renamed from: a */
        public static final vwp0 f2562a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            vwp0 vwp0Var = new vwp0("com.ravelin.core.model.Events", com9, 1);
            vwp0Var.m86594k("events", false);
            f2562a = vwp0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p204p.g210
        public final rr60[] childSerializers() {
            return new rr60[]{Events.f2560b[0].getValue()};
        }

        @Override // p204p.rr60
        public final ktz0 getDescriptor() {
            return f2562a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Events deserialize(fro froVar) {
            vwp0 vwp0Var = f2562a;
            frh frhVarMo29814b = froVar.mo29814b(vwp0Var);
            fr70[] fr70VarArr = Events.f2560b;
            frhVarMo29814b.getClass();
            utz0 utz0Var = null;
            boolean z = true;
            int i = 0;
            Payload[] payloadArr = null;
            while (z) {
                int iMo29816p = frhVarMo29814b.mo29816p(vwp0Var);
                if (iMo29816p == -1) {
                    z = false;
                } else {
                    if (iMo29816p != 0) {
                        throw new UnknownFieldException(iMo29816p);
                    }
                    payloadArr = (Payload[]) frhVarMo29814b.mo39210A(vwp0Var, 0, (rr60) fr70VarArr[0].getValue(), payloadArr);
                    i = 1;
                }
            }
            frhVarMo29814b.mo29813a(vwp0Var);
            return new Events(i, payloadArr, utz0Var);
        }

        @Override // p204p.g210
        public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
            return kvf1.f126859a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(deu deuVar, Events events) {
            vwp0 vwp0Var = f2562a;
            hrh hrhVarMo35820b = deuVar.mo35820b(vwp0Var);
            Events.lpt2(events, hrhVarMo35820b, vwp0Var);
            hrhVarMo35820b.mo44937a(vwp0Var);
        }
    }

    public /* synthetic */ Events(int i, Payload[] payloadArr, utz0 utz0Var) {
        if (1 == (i & 1)) {
            this.events = payloadArr;
        } else {
            edo.m38617p(i, 1, cOm9.lpt2.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ void lpt2(Events self, hrh output, ktz0 serialDesc) {
        output.mo44941k(serialDesc, 0, (rr60) f2560b[0].getValue(), self.events);
    }

    /* JADX INFO: renamed from: COM7, reason: from getter */
    public final Payload[] getEvents() {
        return this.events;
    }

    public final ResponsePayload[] Com8() {
        Payload[] payloadArr = this.events;
        ArrayList arrayList = new ArrayList(payloadArr.length);
        for (Payload payload : payloadArr) {
            arrayList.add(payload.COM7());
        }
        return (ResponsePayload[]) arrayList.toArray(new ResponsePayload[0]);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (Events.class.equals(other != null ? other.getClass() : null)) {
            return Arrays.equals(this.events, ((Events) other).events);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.events);
    }

    public String toString() {
        return s571.m77251j("Events(events=", Arrays.toString(this.events), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Payload[] payloadArr = this.events;
        int length = payloadArr.length;
        dest.writeInt(length);
        for (int i = 0; i != length; i++) {
            payloadArr[i].writeToParcel(dest, flags);
        }
    }

    public Events(Payload[] payloadArr) {
        this.events = payloadArr;
    }
}
