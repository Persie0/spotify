package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class kaj0 implements uaj0 {

    /* JADX INFO: renamed from: a */
    public final String f120919a;

    /* JADX INFO: renamed from: b */
    public final String f120920b;

    /* JADX INFO: renamed from: c */
    public final boolean f120921c;

    /* JADX INFO: renamed from: d */
    public final taj0 f120922d;

    public kaj0(String str, String str2, boolean z, taj0 taj0Var) {
        this.f120919a = str;
        this.f120920b = str2;
        this.f120921c = z;
        this.f120922d = taj0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55907a() {
        return this.f120921c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kaj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kaj0 kaj0Var = (kaj0) obj;
        kaj0Var.getClass();
        return wj50.m88271j(this.f120919a, kaj0Var.f120919a) && wj50.m88271j(this.f120920b, kaj0Var.f120920b) && this.f120921c == kaj0Var.f120921c && this.f120922d.equals(kaj0Var.f120922d);
    }

    public final int hashCode() {
        return this.f120922d.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(Integer.hashCode(R.drawable.bluetooth_prompt_header) * 31, 31, this.f120919a), 31, this.f120920b), 31, this.f120921c);
    }
}
