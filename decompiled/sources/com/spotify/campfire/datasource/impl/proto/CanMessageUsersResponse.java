package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ihc0;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.vgc0;
import p204p.vyd1;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CanMessageUsersResponse extends AbstractC0269h implements CanMessageUsersResponseOrBuilder {
    private static final CanMessageUsersResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 1;
    public static final int SHARED_HIERARCHIES_FIELD_NUMBER = 2;
    private ihc0 results_;
    private ihc0 sharedHierarchies_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponse$1 */
    public static /* synthetic */ class C03371 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3165xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3165xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3165xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3165xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3165xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3165xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3165xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3165xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements CanMessageUsersResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearResults() {
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableResultsMap().clear();
            return this;
        }

        public Builder clearSharedHierarchies() {
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableSharedHierarchiesMap().clear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean containsResults(String str) {
            str.getClass();
            return ((CanMessageUsersResponse) this.instance).getResultsMap().containsKey(str);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean containsSharedHierarchies(String str) {
            str.getClass();
            return ((CanMessageUsersResponse) this.instance).getSharedHierarchiesMap().containsKey(str);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        @Deprecated
        public Map<String, Boolean> getResults() {
            return getResultsMap();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public int getResultsCount() {
            return ((CanMessageUsersResponse) this.instance).getResultsMap().size();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public Map<String, Boolean> getResultsMap() {
            return Collections.unmodifiableMap(((CanMessageUsersResponse) this.instance).getResultsMap());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean getResultsOrDefault(String str, boolean z) {
            str.getClass();
            Map<String, Boolean> resultsMap = ((CanMessageUsersResponse) this.instance).getResultsMap();
            return resultsMap.containsKey(str) ? resultsMap.get(str).booleanValue() : z;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean getResultsOrThrow(String str) {
            str.getClass();
            Map<String, Boolean> resultsMap = ((CanMessageUsersResponse) this.instance).getResultsMap();
            if (resultsMap.containsKey(str)) {
                return resultsMap.get(str).booleanValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        @Deprecated
        public Map<String, SharedHierarchies> getSharedHierarchies() {
            return getSharedHierarchiesMap();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public int getSharedHierarchiesCount() {
            return ((CanMessageUsersResponse) this.instance).getSharedHierarchiesMap().size();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public Map<String, SharedHierarchies> getSharedHierarchiesMap() {
            return Collections.unmodifiableMap(((CanMessageUsersResponse) this.instance).getSharedHierarchiesMap());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public SharedHierarchies getSharedHierarchiesOrDefault(String str, SharedHierarchies sharedHierarchies) {
            str.getClass();
            Map<String, SharedHierarchies> sharedHierarchiesMap = ((CanMessageUsersResponse) this.instance).getSharedHierarchiesMap();
            return sharedHierarchiesMap.containsKey(str) ? sharedHierarchiesMap.get(str) : sharedHierarchies;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public SharedHierarchies getSharedHierarchiesOrThrow(String str) {
            str.getClass();
            Map<String, SharedHierarchies> sharedHierarchiesMap = ((CanMessageUsersResponse) this.instance).getSharedHierarchiesMap();
            if (sharedHierarchiesMap.containsKey(str)) {
                return sharedHierarchiesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder putAllResults(Map<String, Boolean> map) {
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableResultsMap().putAll(map);
            return this;
        }

        public Builder putAllSharedHierarchies(Map<String, SharedHierarchies> map) {
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableSharedHierarchiesMap().putAll(map);
            return this;
        }

        public Builder putResults(String str, boolean z) {
            str.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableResultsMap().put(str, Boolean.valueOf(z));
            return this;
        }

        public Builder putSharedHierarchies(String str, SharedHierarchies sharedHierarchies) {
            str.getClass();
            sharedHierarchies.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableSharedHierarchiesMap().put(str, sharedHierarchies);
            return this;
        }

        public Builder removeResults(String str) {
            str.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableResultsMap().remove(str);
            return this;
        }

        public Builder removeSharedHierarchies(String str) {
            str.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) this.instance).getMutableSharedHierarchiesMap().remove(str);
            return this;
        }

        private Builder() {
            super(CanMessageUsersResponse.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    public static final class ResultsDefaultEntryHolder {
        static final vgc0 defaultEntry = new vgc0(vyd1.f246078g, "", vyd1.f246077f, Boolean.FALSE);

        private ResultsDefaultEntryHolder() {
        }
    }

    public static final class SharedHierarchiesDefaultEntryHolder {
        static final vgc0 defaultEntry = new vgc0(vyd1.f246078g, "", vyd1.f246080i, SharedHierarchies.getDefaultInstance());

        private SharedHierarchiesDefaultEntryHolder() {
        }
    }

    static {
        CanMessageUsersResponse canMessageUsersResponse = new CanMessageUsersResponse();
        DEFAULT_INSTANCE = canMessageUsersResponse;
        AbstractC0269h.registerDefaultInstance(CanMessageUsersResponse.class, canMessageUsersResponse);
    }

    private CanMessageUsersResponse() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.results_ = ihc0Var;
        this.sharedHierarchies_ = ihc0Var;
    }

    public static CanMessageUsersResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Boolean> getMutableResultsMap() {
        return internalGetMutableResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, SharedHierarchies> getMutableSharedHierarchiesMap() {
        return internalGetMutableSharedHierarchies();
    }

    private ihc0 internalGetMutableResults() {
        ihc0 ihc0Var = this.results_;
        if (!ihc0Var.f102236a) {
            this.results_ = ihc0Var.m50613h();
        }
        return this.results_;
    }

    private ihc0 internalGetMutableSharedHierarchies() {
        ihc0 ihc0Var = this.sharedHierarchies_;
        if (!ihc0Var.f102236a) {
            this.sharedHierarchies_ = ihc0Var.m50613h();
        }
        return this.sharedHierarchies_;
    }

    private ihc0 internalGetResults() {
        return this.results_;
    }

    private ihc0 internalGetSharedHierarchies() {
        return this.sharedHierarchies_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CanMessageUsersResponse parseDelimitedFrom(InputStream inputStream) {
        return (CanMessageUsersResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersResponse parseFrom(ByteBuffer byteBuffer) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean containsResults(String str) {
        str.getClass();
        return internalGetResults().containsKey(str);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean containsSharedHierarchies(String str) {
        str.getClass();
        return internalGetSharedHierarchies().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"results_", ResultsDefaultEntryHolder.defaultEntry, "sharedHierarchies_", SharedHierarchiesDefaultEntryHolder.defaultEntry});
        }
        if (iOrdinal == 3) {
            return new CanMessageUsersResponse();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (CanMessageUsersResponse.class) {
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
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    @Deprecated
    public Map<String, Boolean> getResults() {
        return getResultsMap();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public int getResultsCount() {
        return internalGetResults().size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public Map<String, Boolean> getResultsMap() {
        return Collections.unmodifiableMap(internalGetResults());
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean getResultsOrDefault(String str, boolean z) {
        str.getClass();
        ihc0 ihc0VarInternalGetResults = internalGetResults();
        return ihc0VarInternalGetResults.containsKey(str) ? ((Boolean) ihc0VarInternalGetResults.get(str)).booleanValue() : z;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean getResultsOrThrow(String str) {
        str.getClass();
        ihc0 ihc0VarInternalGetResults = internalGetResults();
        if (ihc0VarInternalGetResults.containsKey(str)) {
            return ((Boolean) ihc0VarInternalGetResults.get(str)).booleanValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    @Deprecated
    public Map<String, SharedHierarchies> getSharedHierarchies() {
        return getSharedHierarchiesMap();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public int getSharedHierarchiesCount() {
        return internalGetSharedHierarchies().size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public Map<String, SharedHierarchies> getSharedHierarchiesMap() {
        return Collections.unmodifiableMap(internalGetSharedHierarchies());
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public SharedHierarchies getSharedHierarchiesOrDefault(String str, SharedHierarchies sharedHierarchies) {
        str.getClass();
        ihc0 ihc0VarInternalGetSharedHierarchies = internalGetSharedHierarchies();
        return ihc0VarInternalGetSharedHierarchies.containsKey(str) ? (SharedHierarchies) ihc0VarInternalGetSharedHierarchies.get(str) : sharedHierarchies;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public SharedHierarchies getSharedHierarchiesOrThrow(String str) {
        str.getClass();
        ihc0 ihc0VarInternalGetSharedHierarchies = internalGetSharedHierarchies();
        if (ihc0VarInternalGetSharedHierarchies.containsKey(str)) {
            return (SharedHierarchies) ihc0VarInternalGetSharedHierarchies.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(CanMessageUsersResponse canMessageUsersResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(canMessageUsersResponse);
    }

    public static CanMessageUsersResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CanMessageUsersResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static CanMessageUsersResponse parseFrom(gva gvaVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static CanMessageUsersResponse parseFrom(gva gvaVar, aux auxVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static CanMessageUsersResponse parseFrom(byte[] bArr) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CanMessageUsersResponse parseFrom(byte[] bArr, aux auxVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static CanMessageUsersResponse parseFrom(InputStream inputStream) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CanMessageUsersResponse parseFrom(owe oweVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static CanMessageUsersResponse parseFrom(owe oweVar, aux auxVar) {
        return (CanMessageUsersResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
