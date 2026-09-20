package com.spotify.connectivity.pubsub.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ae50;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.snw;
import p204p.sre0;
import p204p.vkw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsPushedMessage$PushedMessage extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 3;
    private static final EsPushedMessage$PushedMessage DEFAULT_INSTANCE;
    public static final int IDENT_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOADS_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsIdent$Ident ident_;
    private EsKey$Key key_;
    private ihc0 attributes_ = ihc0.f102235b;
    private ae50 payloads_ = AbstractC0269h.emptyProtobufList();

    static {
        EsPushedMessage$PushedMessage esPushedMessage$PushedMessage = new EsPushedMessage$PushedMessage();
        DEFAULT_INSTANCE = esPushedMessage$PushedMessage;
        AbstractC0269h.registerDefaultInstance(EsPushedMessage$PushedMessage.class, esPushedMessage$PushedMessage);
    }

    private EsPushedMessage$PushedMessage() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static EsPushedMessage$PushedMessage m7540r(byte[] bArr) {
        return (EsPushedMessage$PushedMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001c\u00032\u0004ဉ\u0001", new Object[]{"bitField0_", "ident_", "payloads_", "attributes_", snw.f211035a, "key_"});
        }
        if (iOrdinal == 3) {
            return new EsPushedMessage$PushedMessage();
        }
        if (iOrdinal == 4) {
            return new vkw(DEFAULT_INSTANCE, 2);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (EsPushedMessage$PushedMessage.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final Map m7541n() {
        return Collections.unmodifiableMap(this.attributes_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EsIdent$Ident m7542o() {
        EsIdent$Ident esIdent$Ident = this.ident_;
        return esIdent$Ident == null ? EsIdent$Ident.m7535n() : esIdent$Ident;
    }

    /* JADX INFO: renamed from: p */
    public final EsKey$Key m7543p() {
        EsKey$Key esKey$Key = this.key_;
        return esKey$Key == null ? EsKey$Key.m7539n() : esKey$Key;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m7544q() {
        return this.payloads_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
