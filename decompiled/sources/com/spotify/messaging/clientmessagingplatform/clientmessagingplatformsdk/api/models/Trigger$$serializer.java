package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.fr70;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.gtq;
import p204p.hrh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.ql51;
import p204p.rr60;
import p204p.utz0;
import p204p.vwp0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m24212d2 = {"com/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger.$serializer", "Lp/g210;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;", "<init>", "()V", "Lp/deu;", "encoder", "value", "Lp/w2a1;", "serialize", "(Lp/deu;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;)V", "Lp/fro;", "decoder", "deserialize", "(Lp/fro;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;", "", "Lp/rr60;", "childSerializers", "()[Lp/rr60;", "Lp/ktz0;", "descriptor", "Lp/ktz0;", "getDescriptor", "()Lp/ktz0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@gtq
public final /* synthetic */ class Trigger$$serializer implements g210 {
    public static final int $stable;
    public static final Trigger$$serializer INSTANCE;
    private static final ktz0 descriptor;

    static {
        Trigger$$serializer trigger$$serializer = new Trigger$$serializer();
        INSTANCE = trigger$$serializer;
        $stable = 8;
        vwp0 vwp0Var = new vwp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger", trigger$$serializer, 2);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("pattern", false);
        descriptor = vwp0Var;
    }

    private Trigger$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{Trigger.$childSerializers[0].getValue(), ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Trigger deserialize(fro decoder) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = decoder.mo29814b(ktz0Var);
        fr70[] fr70VarArr = Trigger.$childSerializers;
        frhVarMo29814b.getClass();
        utz0 utz0Var = null;
        boolean z = true;
        int i = 0;
        TriggerType triggerType = null;
        String strMo39226f = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                triggerType = (TriggerType) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), triggerType);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new Trigger(i, triggerType, strMo39226f, utz0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu encoder, Trigger value) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = encoder.mo35820b(ktz0Var);
        Trigger.m15171x4f8ee6e9(value, hrhVarMo35820b, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }

    @Override // p204p.g210
    public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
        return kvf1.f126859a;
    }
}
