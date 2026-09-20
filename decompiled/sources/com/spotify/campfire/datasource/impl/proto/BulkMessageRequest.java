package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class BulkMessageRequest extends AbstractC0269h implements BulkMessageRequestOrBuilder {
    public static final int ADD_HIERARCHY_ACTIVITY_FIELD_NUMBER = 2;
    public static final int ADD_NODE_ACTIVITY_FIELD_NUMBER = 1;
    private static final BulkMessageRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bmrCase_ = 0;
    private Object bmr_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.BulkMessageRequest$1 */
    public static /* synthetic */ class C03351 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3163xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3163xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3163xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3163xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3163xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3163xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3163xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3163xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum BmrCase {
        ADD_NODE_ACTIVITY(1),
        ADD_HIERARCHY_ACTIVITY(2),
        BMR_NOT_SET(0);

        private final int value;

        BmrCase(int i) {
            this.value = i;
        }

        public static BmrCase forNumber(int i) {
            if (i == 0) {
                return BMR_NOT_SET;
            }
            if (i == 1) {
                return ADD_NODE_ACTIVITY;
            }
            if (i != 2) {
                return null;
            }
            return ADD_HIERARCHY_ACTIVITY;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BmrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Builder extends AbstractC0268g implements BulkMessageRequestOrBuilder {
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

        public Builder clearAddHierarchyActivity() {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).clearAddHierarchyActivity();
            return this;
        }

        public Builder clearAddNodeActivity() {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).clearAddNodeActivity();
            return this;
        }

        public Builder clearBmr() {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).clearBmr();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public AddHierarchyActivity getAddHierarchyActivity() {
            return ((BulkMessageRequest) this.instance).getAddHierarchyActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public AddNodeActivity getAddNodeActivity() {
            return ((BulkMessageRequest) this.instance).getAddNodeActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public BmrCase getBmrCase() {
            return ((BulkMessageRequest) this.instance).getBmrCase();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public boolean hasAddHierarchyActivity() {
            return ((BulkMessageRequest) this.instance).hasAddHierarchyActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public boolean hasAddNodeActivity() {
            return ((BulkMessageRequest) this.instance).hasAddNodeActivity();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).mergeAddHierarchyActivity(addHierarchyActivity);
            return this;
        }

        public Builder mergeAddNodeActivity(AddNodeActivity addNodeActivity) {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).mergeAddNodeActivity(addNodeActivity);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).setAddHierarchyActivity(addHierarchyActivity);
            return this;
        }

        public Builder setAddNodeActivity(AddNodeActivity addNodeActivity) {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).setAddNodeActivity(addNodeActivity);
            return this;
        }

        private Builder() {
            super(BulkMessageRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setAddHierarchyActivity(AddHierarchyActivity.Builder builder) {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).setAddHierarchyActivity((AddHierarchyActivity) builder.build());
            return this;
        }

        public Builder setAddNodeActivity(AddNodeActivity.Builder builder) {
            copyOnWrite();
            ((BulkMessageRequest) this.instance).setAddNodeActivity((AddNodeActivity) builder.build());
            return this;
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

    static {
        BulkMessageRequest bulkMessageRequest = new BulkMessageRequest();
        DEFAULT_INSTANCE = bulkMessageRequest;
        AbstractC0269h.registerDefaultInstance(BulkMessageRequest.class, bulkMessageRequest);
    }

    private BulkMessageRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddHierarchyActivity() {
        if (this.bmrCase_ == 2) {
            this.bmrCase_ = 0;
            this.bmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddNodeActivity() {
        if (this.bmrCase_ == 1) {
            this.bmrCase_ = 0;
            this.bmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBmr() {
        this.bmrCase_ = 0;
        this.bmr_ = null;
    }

    public static BulkMessageRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
        addHierarchyActivity.getClass();
        if (this.bmrCase_ != 2 || this.bmr_ == AddHierarchyActivity.getDefaultInstance()) {
            this.bmr_ = addHierarchyActivity;
        } else {
            this.bmr_ = ((AddHierarchyActivity.Builder) AddHierarchyActivity.newBuilder((AddHierarchyActivity) this.bmr_).mergeFrom((AbstractC0269h) addHierarchyActivity)).buildPartial();
        }
        this.bmrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddNodeActivity(AddNodeActivity addNodeActivity) {
        addNodeActivity.getClass();
        if (this.bmrCase_ != 1 || this.bmr_ == AddNodeActivity.getDefaultInstance()) {
            this.bmr_ = addNodeActivity;
        } else {
            this.bmr_ = ((AddNodeActivity.Builder) AddNodeActivity.newBuilder((AddNodeActivity) this.bmr_).mergeFrom((AbstractC0269h) addNodeActivity)).buildPartial();
        }
        this.bmrCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BulkMessageRequest parseDelimitedFrom(InputStream inputStream) {
        return (BulkMessageRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BulkMessageRequest parseFrom(ByteBuffer byteBuffer) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
        addHierarchyActivity.getClass();
        this.bmr_ = addHierarchyActivity;
        this.bmrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddNodeActivity(AddNodeActivity addNodeActivity) {
        addNodeActivity.getClass();
        this.bmr_ = addNodeActivity;
        this.bmrCase_ = 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"bmr_", "bmrCase_", AddNodeActivity.class, AddHierarchyActivity.class});
        }
        if (iOrdinal == 3) {
            return new BulkMessageRequest();
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
        synchronized (BulkMessageRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public AddHierarchyActivity getAddHierarchyActivity() {
        return this.bmrCase_ == 2 ? (AddHierarchyActivity) this.bmr_ : AddHierarchyActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public AddNodeActivity getAddNodeActivity() {
        return this.bmrCase_ == 1 ? (AddNodeActivity) this.bmr_ : AddNodeActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public BmrCase getBmrCase() {
        return BmrCase.forNumber(this.bmrCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public boolean hasAddHierarchyActivity() {
        return this.bmrCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public boolean hasAddNodeActivity() {
        return this.bmrCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(BulkMessageRequest bulkMessageRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(bulkMessageRequest);
    }

    public static BulkMessageRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (BulkMessageRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static BulkMessageRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static BulkMessageRequest parseFrom(gva gvaVar) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static BulkMessageRequest parseFrom(gva gvaVar, aux auxVar) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static BulkMessageRequest parseFrom(byte[] bArr) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BulkMessageRequest parseFrom(byte[] bArr, aux auxVar) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static BulkMessageRequest parseFrom(InputStream inputStream) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BulkMessageRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static BulkMessageRequest parseFrom(owe oweVar) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static BulkMessageRequest parseFrom(owe oweVar, aux auxVar) {
        return (BulkMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
