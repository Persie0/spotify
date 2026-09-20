package com.spotify.deviceproxy.navigation.p059v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zrv0;

/* JADX INFO: loaded from: classes6.dex */
public final class RegisterSupportedNavigationCommandsRequest extends AbstractC0269h implements sre0 {
    public static final int COMMANDS_FIELD_NUMBER = 2;
    private static final RegisterSupportedNavigationCommandsRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String deviceId_ = "";
    private ae50 commands_ = AbstractC0269h.emptyProtobufList();

    static {
        RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest = new RegisterSupportedNavigationCommandsRequest();
        DEFAULT_INSTANCE = registerSupportedNavigationCommandsRequest;
        AbstractC0269h.registerDefaultInstance(RegisterSupportedNavigationCommandsRequest.class, registerSupportedNavigationCommandsRequest);
    }

    private RegisterSupportedNavigationCommandsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9295n(RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest, SupportedNavigationCommand supportedNavigationCommand) {
        registerSupportedNavigationCommandsRequest.getClass();
        supportedNavigationCommand.getClass();
        ae50 ae50Var = registerSupportedNavigationCommandsRequest.commands_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            registerSupportedNavigationCommandsRequest.commands_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        registerSupportedNavigationCommandsRequest.commands_.add(supportedNavigationCommand);
    }

    /* JADX INFO: renamed from: o */
    public static void m9296o(RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest, String str) {
        registerSupportedNavigationCommandsRequest.getClass();
        registerSupportedNavigationCommandsRequest.deviceId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static zrv0 m9297r() {
        return (zrv0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"deviceId_", "commands_", SupportedNavigationCommand.class});
        }
        if (iOrdinal == 3) {
            return new RegisterSupportedNavigationCommandsRequest();
        }
        if (iOrdinal == 4) {
            return new zrv0(DEFAULT_INSTANCE);
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
        synchronized (RegisterSupportedNavigationCommandsRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final SupportedNavigationCommand m9298p() {
        return (SupportedNavigationCommand) this.commands_.get(0);
    }

    /* JADX INFO: renamed from: q */
    public final int m9299q() {
        return this.commands_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
