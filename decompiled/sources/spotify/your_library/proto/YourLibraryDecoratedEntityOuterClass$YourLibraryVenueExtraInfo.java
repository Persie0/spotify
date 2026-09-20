package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_NAME_FIELD_NUMBER = 1;
    public static final int CITY_NAME_FIELD_NUMBER = 2;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String addressName_ = "";
    private String cityName_ = "";

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo() {
    }

    /* JADX INFO: renamed from: p */
    public static YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo m98313p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"addressName_", "cityName_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 26);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.class) {
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
    public final String m98314n() {
        return this.addressName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m98315o() {
        return this.cityName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
