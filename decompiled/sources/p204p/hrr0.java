package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public enum hrr0 {
    Editable(R.string.profile_empty_view_editable_title, Integer.valueOf(R.string.profile_empty_view_editable_button), Integer.valueOf(R.string.profile_empty_view_editable_subtitle), true),
    f94520f(10, "Static"),
    f94521g(14, "Kid");


    /* JADX INFO: renamed from: a */
    public final int f94523a;

    /* JADX INFO: renamed from: b */
    public final Integer f94524b;

    /* JADX INFO: renamed from: c */
    public final Integer f94525c;

    /* JADX INFO: renamed from: d */
    public final boolean f94526d;

    /* synthetic */ hrr0(int i, String str) {
        this(i, null, (i & 4) != 0 ? null : Integer.valueOf(R.string.profile_empty_view_static_subtitle), false);
    }

    hrr0(int i, Integer num, Integer num2, boolean z) {
        this.f94523a = i;
        this.f94524b = num;
        this.f94525c = num2;
        this.f94526d = z;
    }
}
