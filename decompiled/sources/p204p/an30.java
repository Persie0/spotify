package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class an30 implements do30 {

    /* JADX INFO: renamed from: a */
    public final int f17259a;

    /* JADX INFO: Fake field, exist only in values array */
    an30 EF8;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ an30[] f17258c = {new vm30("SECTION_HEADER", 0, R.id.hub_glue2_solar_section_header), new wm30("SECTION_HEADER_LARGE", 1, R.id.hub_glue2_solar_section_header_large), new xm30("SECTION_HEADER_SMALL", 2, R.id.hub_glue2_solar_section_header_small), new ym30("SECTION_HEADER_WITH_DESCRIPTION", 3, R.id.hub_glue2_solar_section_header_with_subtitle), new zm30("SECTION_HEADER_WITH_RECOMMENDATION", 4, R.id.hub_glue2_solar_section_header_with_metadata)};

    /* JADX INFO: renamed from: b */
    public static final an30[] f17257b = values();

    public an30(String str, int i, int i2) {
        super(str, i);
        this.f17259a = i2;
    }

    public static an30 valueOf(String str) {
        return (an30) Enum.valueOf(an30.class, str);
    }

    public static an30[] values() {
        return (an30[]) f17258c.clone();
    }

    @Override // p204p.do30
    public final int getId() {
        return this.f17259a;
    }
}
