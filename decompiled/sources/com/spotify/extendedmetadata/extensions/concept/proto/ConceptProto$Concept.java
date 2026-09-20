package com.spotify.extendedmetadata.extensions.concept.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ae50;
import p204p.fuh;
import p204p.ihc0;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConceptProto$Concept extends AbstractC0269h implements sre0 {
    public static final int CONCEPT_CLASS_FIELD_NUMBER = 4;
    private static final ConceptProto$Concept DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int LIBRARYCLASS_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSLATION_MAP_FIELD_NUMBER = 6;
    private int bitField0_;
    private ConceptProto$ConceptClass libraryClass_;
    private ihc0 translationMap_ = ihc0.f102235b;
    private String name_ = "";
    private String imageUri_ = "";
    private ae50 conceptClass_ = AbstractC0269h.emptyProtobufList();

    static {
        ConceptProto$Concept conceptProto$Concept = new ConceptProto$Concept();
        DEFAULT_INSTANCE = conceptProto$Concept;
        AbstractC0269h.registerDefaultInstance(ConceptProto$Concept.class, conceptProto$Concept);
    }

    private ConceptProto$Concept() {
    }

    /* JADX INFO: renamed from: o */
    public static ConceptProto$Concept m9971o(byte[] bArr) {
        return (ConceptProto$Concept) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0001\u0000\u0001Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u00062", new Object[]{"bitField0_", "name_", "imageUri_", "conceptClass_", ConceptProto$ConceptClass.class, "libraryClass_", "translationMap_", fuh.f73505a});
        }
        if (iOrdinal == 3) {
            return new ConceptProto$Concept();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 22);
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
        synchronized (ConceptProto$Concept.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final Map m9972n() {
        return Collections.unmodifiableMap(this.translationMap_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
