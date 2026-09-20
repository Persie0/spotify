package p204p;

import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class thm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220456a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f220457b;

    public thm0(int i) {
        this.f220456a = i;
        switch (i) {
            case 1:
                this.f220457b = new LinkedHashMap();
                break;
            default:
                this.f220457b = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final UUID m80860a(j101 j101Var) {
        switch (this.f220456a) {
            case 0:
                UUID uuidRandomUUID = UUID.randomUUID();
                this.f220457b.put(j101Var, uuidRandomUUID);
                wj50.m88279p(uuidRandomUUID);
                return uuidRandomUUID;
            default:
                UUID uuidRandomUUID2 = UUID.randomUUID();
                this.f220457b.put(j101Var, uuidRandomUUID2);
                return uuidRandomUUID2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final UUID m80861b(j101 j101Var) {
        switch (this.f220456a) {
            case 0:
                UUID uuid = (UUID) this.f220457b.get(j101Var);
                return uuid == null ? m80860a(j101Var) : uuid;
            default:
                UUID uuid2 = (UUID) this.f220457b.get(j101Var);
                return uuid2 == null ? m80860a(j101Var) : uuid2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m80862c(j101 j101Var, String str) {
        switch (this.f220456a) {
            case 0:
                if (str != null) {
                    this.f220457b.put(j101Var, UUID.fromString(str));
                }
                break;
            default:
                if (str != null) {
                    this.f220457b.put(j101Var, UUID.fromString(str));
                }
                break;
        }
    }
}
