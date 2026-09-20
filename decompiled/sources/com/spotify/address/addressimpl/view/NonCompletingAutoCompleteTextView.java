package com.spotify.address.addressimpl.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/address/addressimpl/view/NonCompletingAutoCompleteTextView;", "Landroid/widget/AutoCompleteTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "a", "Z", "getAutocompleteEnabled", "()Z", "setAutocompleteEnabled", "(Z)V", "autocompleteEnabled", "src_main_java_com_spotify_address_addressimpl-addressimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NonCompletingAutoCompleteTextView extends AutoCompleteTextView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean autocompleteEnabled;

    public NonCompletingAutoCompleteTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.autocompleteEnabled && super.enoughToFilter();
    }

    public final boolean getAutocompleteEnabled() {
        return this.autocompleteEnabled;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public final void setAutocompleteEnabled(boolean z) {
        this.autocompleteEnabled = z;
    }

    public NonCompletingAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NonCompletingAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public /* synthetic */ NonCompletingAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.autoCompleteTextViewStyle : i);
    }
}
