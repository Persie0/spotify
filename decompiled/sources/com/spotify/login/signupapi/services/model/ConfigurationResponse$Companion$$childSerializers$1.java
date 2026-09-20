package com.spotify.login.signupapi.services.model;

import kotlin.Metadata;
import p204p.eh00;
import p204p.mj5;
import p204p.qe70;
import p204p.rr60;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ConfigurationResponse$Companion$$childSerializers$1 extends qe70 implements eh00 {
    public static final ConfigurationResponse$Companion$$childSerializers$1 INSTANCE = new ConfigurationResponse$Companion$$childSerializers$1();

    public ConfigurationResponse$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // p204p.eh00
    public final rr60 invoke() {
        return new mj5(CallingCode$$serializer.INSTANCE, 0);
    }
}
