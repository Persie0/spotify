package com.spotify.allboarding.allboardingdomain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import p204p.lpy0;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, m24212d2 = {"Lcom/spotify/allboarding/allboardingdomain/model/SearchConfiguration;", "Landroid/os/Parcelable;", "", "url", "placeholder", "initialText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/allboarding/allboardingdomain/model/SearchConfiguration;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getPlaceholder", "getInitialText", "src_main_java_com_spotify_allboarding_allboardingdomain-allboardingdomain"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class SearchConfiguration implements Parcelable {
    public static final Parcelable.Creator<SearchConfiguration> CREATOR = new lpy0(0);
    private final String initialText;
    private final String placeholder;
    private final String url;

    public SearchConfiguration(String str, String str2, String str3) {
        this.url = str;
        this.placeholder = str2;
        this.initialText = str3;
    }

    public static /* synthetic */ SearchConfiguration copy$default(SearchConfiguration searchConfiguration, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchConfiguration.url;
        }
        if ((i & 2) != 0) {
            str2 = searchConfiguration.placeholder;
        }
        if ((i & 4) != 0) {
            str3 = searchConfiguration.initialText;
        }
        return searchConfiguration.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInitialText() {
        return this.initialText;
    }

    public final SearchConfiguration copy(String url, String placeholder, String initialText) {
        return new SearchConfiguration(url, placeholder, initialText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchConfiguration)) {
            return false;
        }
        SearchConfiguration searchConfiguration = (SearchConfiguration) other;
        return wj50.m88271j(this.url, searchConfiguration.url) && wj50.m88271j(this.placeholder, searchConfiguration.placeholder) && wj50.m88271j(this.initialText, searchConfiguration.initialText);
    }

    public final String getInitialText() {
        return this.initialText;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.initialText.hashCode() + s571.m77243b(this.url.hashCode() * 31, 31, this.placeholder);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.placeholder);
        dest.writeString(this.initialText);
    }
}
