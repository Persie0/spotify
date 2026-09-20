package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class nlm0 {

    /* JADX INFO: Fake field, exist only in values array */
    nlm0 EF5;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nlm0[] f155112b = {new nlm0("PENDING_INVITATION", 0), new nlm0("READY_TO_JOIN_EMPTY_BLEND", 1), new nlm0("READY_TO_JOIN_ALREADY_CREATED_BLEND", 2), new nlm0("MAX_MEMBERS", 3), new nlm0("ALREADY_JOINED", 4), new nlm0("DELETED", 5)};
    public static final llm0 Companion = new llm0();

    /* JADX INFO: renamed from: a */
    public static final Object f155111a = q3d0.m72078I(2, ytl0.f276151Q0);

    public static nlm0 valueOf(String str) {
        return (nlm0) Enum.valueOf(nlm0.class, str);
    }

    public static nlm0[] values() {
        return (nlm0[]) f155112b.clone();
    }
}
