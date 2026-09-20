package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class gn30 implements do30 {

    /* JADX INFO: Fake field, exist only in values array */
    gn30 EF5;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ gn30[] f81538b = {new fn30("TRACK_CLOUD", 0)};

    /* JADX INFO: renamed from: a */
    public static final gn30[] f81537a = values();

    public static gn30 valueOf(String str) {
        return (gn30) Enum.valueOf(gn30.class, str);
    }

    public static gn30[] values() {
        return (gn30[]) f81538b.clone();
    }

    @Override // p204p.do30
    public final int getId() {
        return R.id.hub_glue2_solar_track_cloud;
    }
}
