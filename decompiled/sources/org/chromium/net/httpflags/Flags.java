package org.chromium.net.httpflags;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p204p.aux;
import p204p.gva;
import p204p.ihc0;
import p204p.owe;
import p204p.r110;
import p204p.r2n0;
import p204p.vgc0;
import p204p.vyd1;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Flags extends AbstractC0269h implements FlagsOrBuilder {
    private static final Flags DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 flags_ = ihc0.f102235b;

    /* JADX INFO: renamed from: org.chromium.net.httpflags.Flags$1 */
    public static /* synthetic */ class C16431 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f10951xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f10951xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10951xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10951xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10951xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10951xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10951xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10951xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements FlagsOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder clearFlags() {
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().clear();
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public boolean containsFlags(String str) {
            str.getClass();
            return ((Flags) this.instance).getFlagsMap().containsKey(str);
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        @Deprecated
        public Map<String, FlagValue> getFlags() {
            return getFlagsMap();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public int getFlagsCount() {
            return ((Flags) this.instance).getFlagsMap().size();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public Map<String, FlagValue> getFlagsMap() {
            return Collections.unmodifiableMap(((Flags) this.instance).getFlagsMap());
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public FlagValue getFlagsOrDefault(String str, FlagValue flagValue) {
            str.getClass();
            Map<String, FlagValue> flagsMap = ((Flags) this.instance).getFlagsMap();
            return flagsMap.containsKey(str) ? flagsMap.get(str) : flagValue;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public FlagValue getFlagsOrThrow(String str) {
            str.getClass();
            Map<String, FlagValue> flagsMap = ((Flags) this.instance).getFlagsMap();
            if (flagsMap.containsKey(str)) {
                return flagsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFlags(Map<String, FlagValue> map) {
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().putAll(map);
            return this;
        }

        public Builder putFlags(String str, FlagValue flagValue) {
            str.getClass();
            flagValue.getClass();
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().put(str, flagValue);
            return this;
        }

        public Builder removeFlags(String str) {
            str.getClass();
            copyOnWrite();
            ((Flags) this.instance).getMutableFlagsMap().remove(str);
            return this;
        }

        private Builder() {
            super(Flags.DEFAULT_INSTANCE);
        }
    }

    public static final class FlagsDefaultEntryHolder {
        static final vgc0 defaultEntry = new vgc0(vyd1.f246078g, "", vyd1.f246080i, FlagValue.getDefaultInstance());

        private FlagsDefaultEntryHolder() {
        }
    }

    static {
        Flags flags = new Flags();
        DEFAULT_INSTANCE = flags;
        AbstractC0269h.registerDefaultInstance(Flags.class, flags);
    }

    private Flags() {
    }

    public static Flags getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, FlagValue> getMutableFlagsMap() {
        return internalGetMutableFlags();
    }

    private ihc0 internalGetFlags() {
        return this.flags_;
    }

    private ihc0 internalGetMutableFlags() {
        ihc0 ihc0Var = this.flags_;
        if (!ihc0Var.f102236a) {
            this.flags_ = ihc0Var.m50613h();
        }
        return this.flags_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Flags parseDelimitedFrom(InputStream inputStream) {
        return (Flags) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Flags parseFrom(ByteBuffer byteBuffer) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public boolean containsFlags(String str) {
        str.getClass();
        return internalGetFlags().containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        switch (z110Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", FlagsDefaultEntryHolder.defaultEntry});
            case 3:
                return new Flags();
            case 4:
                return new Builder(0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r2n0 r2n0Var = PARSER;
                if (r2n0Var != null) {
                    return r2n0Var;
                }
                synchronized (Flags.class) {
                    try {
                        r110Var = PARSER;
                        if (r110Var == null) {
                            r110Var = new r110(DEFAULT_INSTANCE);
                            PARSER = r110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return r110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    @Deprecated
    public Map<String, FlagValue> getFlags() {
        return getFlagsMap();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public int getFlagsCount() {
        return internalGetFlags().size();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public Map<String, FlagValue> getFlagsMap() {
        return Collections.unmodifiableMap(internalGetFlags());
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public FlagValue getFlagsOrDefault(String str, FlagValue flagValue) {
        str.getClass();
        ihc0 ihc0VarInternalGetFlags = internalGetFlags();
        return ihc0VarInternalGetFlags.containsKey(str) ? (FlagValue) ihc0VarInternalGetFlags.get(str) : flagValue;
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public FlagValue getFlagsOrThrow(String str) {
        str.getClass();
        ihc0 ihc0VarInternalGetFlags = internalGetFlags();
        if (ihc0VarInternalGetFlags.containsKey(str)) {
            return (FlagValue) ihc0VarInternalGetFlags.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(Flags flags) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(flags);
    }

    public static Flags parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Flags) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Flags parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Flags parseFrom(gva gvaVar) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Flags parseFrom(gva gvaVar, aux auxVar) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Flags parseFrom(byte[] bArr) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Flags parseFrom(byte[] bArr, aux auxVar) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Flags parseFrom(InputStream inputStream) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Flags parseFrom(InputStream inputStream, aux auxVar) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Flags parseFrom(owe oweVar) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Flags parseFrom(owe oweVar, aux auxVar) {
        return (Flags) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
