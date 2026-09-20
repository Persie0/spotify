package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo extends AbstractC0269h implements sre0 {
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_FOLDERS_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_PLAYLISTS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 4;
    private int numberOfFolders_;
    private int numberOfPlaylists_;
    private String rowId_ = "";
    private ae50 entity_ = AbstractC0269h.emptyProtobufList();

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo m98283n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u0004\u0003\u0004\u0004Ȉ\u0005\u001b", new Object[]{"numberOfPlaylists_", "numberOfFolders_", "rowId_", "entity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 19);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.class) {
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

    /* JADX INFO: renamed from: o */
    public final int m98284o() {
        return this.numberOfFolders_;
    }

    /* JADX INFO: renamed from: p */
    public final int m98285p() {
        return this.numberOfPlaylists_;
    }

    /* JADX INFO: renamed from: q */
    public final String m98286q() {
        return this.rowId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
