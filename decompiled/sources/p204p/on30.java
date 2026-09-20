package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class on30 implements do30 {

    /* JADX INFO: renamed from: b */
    public static final kn30 f167145b;

    /* JADX INFO: renamed from: c */
    public static final ln30 f167146c;

    /* JADX INFO: renamed from: d */
    public static final mn30 f167147d;

    /* JADX INFO: renamed from: e */
    public static final nn30 f167148e;

    /* JADX INFO: renamed from: f */
    public static final on30[] f167149f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ on30[] f167150g;

    /* JADX INFO: renamed from: a */
    public final int f167151a;

    static {
        kn30 kn30Var = new kn30("NO_TEXT", 0, R.id.hub_glue_card_no_text);
        f167145b = kn30Var;
        ln30 ln30Var = new ln30("TITLE", 1, R.id.hub_glue_card_title);
        f167146c = ln30Var;
        mn30 mn30Var = new mn30("TITLE_METADATA", 2, R.id.hub_glue_card_title_metadata);
        f167147d = mn30Var;
        nn30 nn30Var = new nn30("TITLE_SUBTITLE", 3, R.id.hub_glue_card_title_subtitle);
        f167148e = nn30Var;
        f167150g = new on30[]{kn30Var, ln30Var, mn30Var, nn30Var};
        f167149f = values();
    }

    public on30(String str, int i, int i2) {
        super(str, i);
        this.f167151a = i2;
    }

    public static on30 valueOf(String str) {
        return (on30) Enum.valueOf(on30.class, str);
    }

    public static on30[] values() {
        return (on30[]) f167150g.clone();
    }

    @Override // p204p.do30
    public final int getId() {
        return this.f167151a;
    }
}
