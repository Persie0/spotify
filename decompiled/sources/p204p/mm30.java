package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class mm30 implements do30 {

    /* JADX INFO: renamed from: a */
    public final int f145037a;

    /* JADX INFO: renamed from: b */
    public final String f145038b;

    /* JADX INFO: Fake field, exist only in values array */
    mm30 EF10;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ mm30[] f145036d = {new gm30(0, "DEFAULT", R.id.hub_glue2_section_header, "default"), new hm30(1, "DEFAULT_WITH_SUBTITLE", R.id.hub_glue2_section_header_with_subtitle, "defaultWithSubtitle"), new im30(2, "DEFAULT_WITH_METADATA", R.id.hub_glue2_section_header_with_metadata, "defaultWithMetadata"), new jm30(3, "LARGE", R.id.hub_glue2_section_header_large, "large"), new km30(4, "SMALL", R.id.hub_glue2_section_header_small, "small"), new lm30(5, "EXTRA_SMALL", R.id.hub_glue2_section_header_extra_small, "extraSmall")};

    /* JADX INFO: renamed from: c */
    public static final mm30[] f145035c = values();

    public mm30(int i, String str, int i2, String str2) {
        super(str, i);
        this.f145037a = i2;
        this.f145038b = str2;
    }

    public static mm30 valueOf(String str) {
        return (mm30) Enum.valueOf(mm30.class, str);
    }

    public static mm30[] values() {
        return (mm30[]) f145036d.clone();
    }

    @Override // p204p.do30
    public final int getId() {
        return this.f145037a;
    }
}
