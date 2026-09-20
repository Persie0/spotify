package p204p;

import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class iaj0 implements uaj0 {

    /* JADX INFO: renamed from: a */
    public final String f100264a;

    /* JADX INFO: renamed from: b */
    public final List f100265b;

    /* JADX INFO: renamed from: c */
    public final String f100266c;

    public iaj0(String str, List list, String str2) {
        this.f100264a = str;
        this.f100265b = list;
        this.f100266c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!iaj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        iaj0 iaj0Var = (iaj0) obj;
        iaj0Var.getClass();
        return wj50.m88271j(this.f100264a, iaj0Var.f100264a) && this.f100265b.equals(iaj0Var.f100265b) && wj50.m88271j(this.f100266c, iaj0Var.f100266c);
    }

    public final int hashCode() {
        return this.f100266c.hashCode() + s571.m77244c(s571.m77243b(Integer.hashCode(R.drawable.bluetooth_prompt_header) * 31, 31, this.f100264a), 31, this.f100265b);
    }
}
