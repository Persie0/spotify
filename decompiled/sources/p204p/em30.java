package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class em30 implements bk30, lk30 {

    /* JADX INFO: renamed from: a */
    public final String f60810a;

    /* JADX INFO: Fake field, exist only in values array */
    em30 EF7;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ em30[] f60809h = {new am30("CALENDAR_ROW", 0, "glue2:calendarRow"), new bm30("IMAGE_ROW", 1, "glue2:imageRow"), new cm30("MULTILINE", 2, "glue2:text"), new dm30("VIDEO", 3, "glue2:videoRow")};

    /* JADX INFO: renamed from: b */
    public static final int f60803b = R.id.hub_glue2_row_multiline;

    /* JADX INFO: renamed from: c */
    public static final int f60804c = R.id.hub_glue2_row_single_line_calendar;

    /* JADX INFO: renamed from: d */
    public static final int f60805d = R.id.hub_glue2_row_single_line_image;

    /* JADX INFO: renamed from: e */
    public static final int f60806e = R.id.hub_glue2_row_two_line_calendar;

    /* JADX INFO: renamed from: f */
    public static final int f60807f = R.id.hub_glue2_row_two_line_image;

    /* JADX INFO: renamed from: g */
    public static final int f60808g = R.id.hub_glue2_video_row;

    public em30(String str, int i, String str2) {
        super(str, i);
        this.f60810a = str2;
    }

    public static em30 valueOf(String str) {
        return (em30) Enum.valueOf(em30.class, str);
    }

    public static em30[] values() {
        return (em30[]) f60809h.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return xj30.ROW.f262032a;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f60810a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f60810a;
    }
}
