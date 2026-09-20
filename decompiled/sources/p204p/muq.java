package p204p;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class muq {

    /* JADX INFO: renamed from: a */
    public final SpannableStringBuilder f147406a;

    /* JADX INFO: renamed from: b */
    public final long f147407b;

    public muq(SpannableStringBuilder spannableStringBuilder, long j) {
        this.f147406a = spannableStringBuilder;
        this.f147407b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muq)) {
            return false;
        }
        muq muqVar = (muq) obj;
        return this.f147406a.equals(muqVar.f147406a) && this.f147407b == muqVar.f147407b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147407b) + (this.f147406a.hashCode() * 31);
    }
}
