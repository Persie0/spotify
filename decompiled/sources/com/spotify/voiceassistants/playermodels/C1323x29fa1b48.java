package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import p204p.pk60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: renamed from: com.spotify.voiceassistants.playermodels.MetadataItem$Album$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* synthetic */ class C1323x29fa1b48 implements pk60 {
    private final /* synthetic */ String discriminator;

    public C1323x29fa1b48(String str) {
        this.discriminator = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return pk60.class;
    }

    @Override // p204p.pk60
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof pk60) && wj50.m88271j(discriminator(), ((pk60) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return s571.m77251j("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, ")");
    }
}
