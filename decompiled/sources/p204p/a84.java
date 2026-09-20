package p204p;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class a84 implements wxy {

    /* JADX INFO: renamed from: a */
    public final AutofillValue f13183a;

    public a84(AutofillValue autofillValue) {
        this.f13183a = autofillValue;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m25029a() {
        if (this.f13183a.isToggle()) {
            return Boolean.valueOf(this.f13183a.getToggleValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m25030b() {
        if (this.f13183a.isText()) {
            return this.f13183a.getTextValue();
        }
        return null;
    }
}
