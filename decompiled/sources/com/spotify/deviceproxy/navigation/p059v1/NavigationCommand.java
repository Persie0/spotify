package com.spotify.deviceproxy.navigation.p059v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class NavigationCommand extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int COMMAND_ID_FIELD_NUMBER = 1;
    private static final NavigationCommand DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_DEVICE_ID_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 3;
    private String commandId_ = "";
    private String action_ = "";
    private String uri_ = "";
    private String targetDeviceId_ = "";
    private String interactionId_ = "";

    static {
        NavigationCommand navigationCommand = new NavigationCommand();
        DEFAULT_INSTANCE = navigationCommand;
        AbstractC0269h.registerDefaultInstance(NavigationCommand.class, navigationCommand);
    }

    private NavigationCommand() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static NavigationCommand m9290r(byte[] bArr) {
        return (NavigationCommand) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"commandId_", "action_", "uri_", "targetDeviceId_", "interactionId_"});
        }
        if (iOrdinal == 3) {
            return new NavigationCommand();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 25);
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
        synchronized (NavigationCommand.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m9291n() {
        return this.action_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9292o() {
        return this.commandId_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9293p() {
        return this.interactionId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m9294q() {
        return this.targetDeviceId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
