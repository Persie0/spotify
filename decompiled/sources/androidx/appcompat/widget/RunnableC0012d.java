package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0012d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView.SearchAutoComplete f359a;

    public RunnableC0012d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f359a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f359a;
        if (searchAutoComplete.f260g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f260g = false;
        }
    }
}
