package com.spotify.kidsaccount.api.p083v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetChildAccountSettingsResponse extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 11;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 3;
    private static final GetChildAccountSettingsResponse DEFAULT_INSTANCE;
    public static final int ENFORCED_DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 6;
    public static final int ENFORCED_DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 5;
    public static final int IMAGE_URI_FIELD_NUMBER = 10;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PARENTAL_CONTROL_CONNECT_FIELD_NUMBER = 7;
    public static final int PARENTAL_CONTROL_EXPLICIT_CONTENT_FIELD_NUMBER = 8;
    public static final int PARENTAL_CONTROL_VIDEO_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Int32Value color_;
    private StringValue imageUri_;
    private ParentalControl parentalControlConnect_;
    private ParentalControl parentalControlExplicitContent_;
    private ParentalControl parentalControlVideo_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";
    private String enforcedDateOfBirthMinDate_ = "";
    private String enforcedDateOfBirthMaxDate_ = "";

    static {
        GetChildAccountSettingsResponse getChildAccountSettingsResponse = new GetChildAccountSettingsResponse();
        DEFAULT_INSTANCE = getChildAccountSettingsResponse;
        AbstractC0269h.registerDefaultInstance(GetChildAccountSettingsResponse.class, getChildAccountSettingsResponse);
    }

    private GetChildAccountSettingsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\tဉ\u0002\nဉ\u0003\u000bဉ\u0004", new Object[]{"bitField0_", "name_", "dateOfBirth_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_", "enforcedDateOfBirthMinDate_", "enforcedDateOfBirthMaxDate_", "parentalControlConnect_", "parentalControlExplicitContent_", "parentalControlVideo_", "imageUri_", "color_"});
        }
        if (iOrdinal == 3) {
            return new GetChildAccountSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 9);
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
        synchronized (GetChildAccountSettingsResponse.class) {
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

    public final Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.m1943p() : int32Value;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    public final String getDateOfBirthMaxDate() {
        return this.dateOfBirthMaxDate_;
    }

    public final String getDateOfBirthMinDate() {
        return this.dateOfBirthMinDate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final StringValue getImageUri() {
        StringValue stringValue = this.imageUri_;
        return stringValue == null ? StringValue.m1959p() : stringValue;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m12085n() {
        return this.enforcedDateOfBirthMinDate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ParentalControl m12086o() {
        ParentalControl parentalControl = this.parentalControlExplicitContent_;
        return parentalControl == null ? ParentalControl.m12096n() : parentalControl;
    }

    /* JADX INFO: renamed from: p */
    public final ParentalControl m12087p() {
        ParentalControl parentalControl = this.parentalControlVideo_;
        return parentalControl == null ? ParentalControl.m12096n() : parentalControl;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
