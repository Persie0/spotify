package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class hq30 implements do30 {

    /* JADX INFO: renamed from: a */
    public final int f94014a;

    /* JADX INFO: Fake field, exist only in values array */
    hq30 EF8;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hq30[] f94013c = {new dq30("SECTION_HEADER_LARGE", 0, R.id.hub_glue_section_header_large), new eq30("SECTION_HEADER_LARGE_WITH_DESCRIPTION", 1, R.id.hub_glue_section_header_large_with_description), new fq30("SECTION_HEADER_SMALL", 2, R.id.hub_glue_section_header_small), new gq30("SECTION_HEADER_SMALL_WITH_DESCRIPTION", 3, R.id.hub_glue_section_header_small_with_description)};

    /* JADX INFO: renamed from: b */
    public static final hq30[] f94012b = values();

    public hq30(String str, int i, int i2) {
        super(str, i);
        this.f94014a = i2;
    }

    public static hq30 valueOf(String str) {
        return (hq30) Enum.valueOf(hq30.class, str);
    }

    public static hq30[] values() {
        return (hq30[]) f94013c.clone();
    }

    @Override // p204p.do30
    public final int getId() {
        return this.f94014a;
    }
}
