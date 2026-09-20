package p204p;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x1v {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f257279a;

    /* JADX INFO: renamed from: b */
    public final Context f257280b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f257281c;

    /* JADX INFO: renamed from: d */
    public final int f257282d;

    public x1v(TextInputLayout textInputLayout, int i) {
        this.f257279a = textInputLayout;
        this.f257280b = textInputLayout.getContext();
        this.f257281c = textInputLayout.getEndIconView();
        this.f257282d = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo25262a();

    /* JADX INFO: renamed from: b */
    public boolean mo56526b(int i) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void mo85524c(boolean z) {
    }
}
