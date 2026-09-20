package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC0009a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f357a;

    public ViewOnClickListenerC0009a(SearchView searchView) {
        this.f357a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f357a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f222Q0;
        if (view == searchView.f226U0) {
            searchView.m147x(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f245n1;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f228W0) {
            searchView.m137n();
            return;
        }
        if (view == searchView.f227V0) {
            searchView.m141r();
            return;
        }
        if (view != searchView.f229X0) {
            if (view == searchAutoComplete) {
                searchView.m136m();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f217B1;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m135l(searchView.f241j1, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f240i1);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }
}
