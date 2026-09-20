package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import p204p.ezj;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vco0;
import p204p.vxd0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Context extends AbstractC0269h implements sre0 {
    private static final Context DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int LOCAL_TIME_OF_DAY_FIELD_NUMBER = 3;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 1;
    private int bitField0_;
    private Device device_;
    private String localTimeOfDay_ = "";
    private int mediaType_;
    private int platform_;

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        AbstractC0269h.registerDefaultInstance(Context.class, context);
    }

    private Context() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3040n(Context context, Device device) {
        context.getClass();
        device.getClass();
        context.device_ = device;
        context.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m3041o(Context context, String str) {
        context.getClass();
        context.localTimeOfDay_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3042p(Context context, vxd0 vxd0Var) {
        context.getClass();
        context.mediaType_ = vxd0Var.getNumber();
        context.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3043q(Context context, vco0 vco0Var) {
        context.getClass();
        context.platform_ = vco0Var.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static Context m3044r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static ezj m3045t() {
        return (ezj) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ\u0007ဌ\u0001", new Object[]{"bitField0_", "platform_", "device_", "localTimeOfDay_", "mediaType_"});
        }
        if (iOrdinal == 3) {
            return new Context();
        }
        if (iOrdinal == 4) {
            return new ezj(DEFAULT_INSTANCE);
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
        synchronized (Context.class) {
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

    /* JADX INFO: renamed from: s */
    public final vco0 m3046s() {
        vco0 vco0Var;
        switch (this.platform_) {
            case 0:
                vco0Var = vco0.UNKNOWN_PLATFORM;
                break;
            case 1:
                vco0Var = vco0.META_RB;
                break;
            case 2:
                vco0Var = vco0.GEMINI_WEB;
                break;
            case 3:
                vco0Var = vco0.GEMINI_ANDROID;
                break;
            case 4:
                vco0Var = vco0.GEMINI_IOS;
                break;
            case 5:
                vco0Var = vco0.GEMINI_DESKTOP;
                break;
            case 6:
                vco0Var = vco0.GEMINI_SPEAKER;
                break;
            case 7:
                vco0Var = vco0.GEMINI_SMART_DISPLAY;
                break;
            case 8:
                vco0Var = vco0.GEMINI_AUTOMOBILE;
                break;
            case 9:
                vco0Var = vco0.GEMINI_ANDROID_AUTO_PROJECTED;
                break;
            case 10:
                vco0Var = vco0.GEMINI_ANDROID_AUTO_EMBEDDED;
                break;
            case 11:
                vco0Var = vco0.GEMINI_ANDROID_AUTOMOTIVE_OS;
                break;
            case 12:
                vco0Var = vco0.GEMINI_WEAR_OS;
                break;
            case 13:
                vco0Var = vco0.GEMINI_VR_ANDROID;
                break;
            case 14:
                vco0Var = vco0.GEMINI_VR_WEB;
                break;
            case 15:
                vco0Var = vco0.GEMINI_GLASSES_ANDROID;
                break;
            case 16:
                vco0Var = vco0.GEMINI_GLASSES_IOS;
                break;
            case 17:
                vco0Var = vco0.GEMINI_MAPS_NAVIGATION_ANDROID;
                break;
            case 18:
                vco0Var = vco0.GEMINI_MAPS_NAVIGATION_IOS;
                break;
            case 19:
                vco0Var = vco0.GEMINI_TV;
                break;
            case 20:
                vco0Var = vco0.GA_TV;
                break;
            case 21:
                vco0Var = vco0.SAMSUNG_AI_BRIEF;
                break;
            case 22:
                vco0Var = vco0.ALEXA_PLUS;
                break;
            case 23:
                vco0Var = vco0.GA_SPEAKER;
                break;
            case 24:
                vco0Var = vco0.GA_SMART_DISPLAY;
                break;
            case 25:
                vco0Var = vco0.GA_ANDROID;
                break;
            case 26:
                vco0Var = vco0.GPT_WEB;
                break;
            case 27:
                vco0Var = vco0.GPT_DESKTOP;
                break;
            case 28:
                vco0Var = vco0.GPT_IOS;
                break;
            case 29:
                vco0Var = vco0.GPT_ANDROID;
                break;
            case 30:
                vco0Var = vco0.PERPLEXITY_IOS;
                break;
            case 31:
                vco0Var = vco0.PERPLEXITY_ANDROID;
                break;
            case 32:
                vco0Var = vco0.SAMSUNG_BIXBY_TV;
                break;
            case 33:
                vco0Var = vco0.META_RB_TESTERS;
                break;
            case 34:
                vco0Var = vco0.SESAME_VOICE_TEST;
                break;
            case 35:
                vco0Var = vco0.XIAOMI_AUTOMOTIVE;
                break;
            case 36:
                vco0Var = vco0.CLAUDE_WEB;
                break;
            case 37:
                vco0Var = vco0.CLAUDE_IOS;
                break;
            case 38:
                vco0Var = vco0.CLAUDE_ANDROID;
                break;
            case 39:
                vco0Var = vco0.CLAUDE_DESKTOP;
                break;
            case 40:
                vco0Var = vco0.SAMSUNG_AI_VISION_TV;
                break;
            case 41:
                vco0Var = vco0.NAVER;
                break;
            case 42:
                vco0Var = vco0.GEMINI_ANDROID_GO;
                break;
            case 43:
                vco0Var = vco0.CERENCE_AUTOMOTIVE;
                break;
            case 44:
                vco0Var = vco0.PARTNER_AGENT_DESIGN_PROTOTYPE;
                break;
            case 45:
                vco0Var = vco0.GEMINI_WEAR_OS_UNTETHERED;
                break;
            case 46:
                vco0Var = vco0.GEMINI_GOOGLE_SEARCH;
                break;
            case 47:
                vco0Var = vco0.AUTOMOTIVE_NATIVE;
                break;
            case 48:
                vco0Var = vco0.RIVIAN_AUTOMOTIVE;
                break;
            case 49:
                vco0Var = vco0.MCP_APP_WEB;
                break;
            case 50:
                vco0Var = vco0.MCP_APP_DESKTOP;
                break;
            case 51:
                vco0Var = vco0.MCP_APP_IOS;
                break;
            case 52:
                vco0Var = vco0.MCP_APP_ANDROID;
                break;
            case 53:
                vco0Var = vco0.TESLA_AUTOMOTIVE;
                break;
            case 54:
                vco0Var = vco0.WEBOS_TV;
                break;
            case 55:
                vco0Var = vco0.ANDROID_TV;
                break;
            case 56:
                vco0Var = vco0.SIRI_AI;
                break;
            case 57:
                vco0Var = vco0.GEMINI_EVAL;
                break;
            case 58:
                vco0Var = vco0.SNAP_SPECS;
                break;
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                vco0Var = vco0.SAMSUNG_BIXBY_MOBILE;
                break;
            case 60:
                vco0Var = vco0.SAMSUNG_S_FINDER;
                break;
            default:
                vco0Var = null;
                break;
        }
        return vco0Var == null ? vco0.UNRECOGNIZED : vco0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
