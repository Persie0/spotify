package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0011c {
    /* JADX INFO: renamed from: a */
    public static void m176a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    /* JADX INFO: renamed from: b */
    public static void m177b(SearchView.SearchAutoComplete searchAutoComplete, int i) {
        searchAutoComplete.setInputMethodMode(i);
    }
}
