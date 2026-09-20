package com.spotify.widgets.npvwidget;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetStateKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.lzv;
import p204p.mt60;
import p204p.nzv;
import p204p.s571;
import p204p.t5m;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m24211d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&\u0082\u0001\u000e\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "Landroid/os/Parcelable;", "<init>", "()V", "getPageIdentifierPath", "", "getBranchCampaign", "SpotifyLogo", "Login", "NpvMetadata", "Background", "BackgroundSessionState", "ItemClick", "PlayCommand", "PauseCommand", "NextCommand", "PreviousCommand", "SeekBackwardCommand", "SeekForwardCommand", "CurateCommand", "RefreshWidget", "WrappedClick", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$Background;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$CurateCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$Login;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$NextCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$NpvMetadata;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$PauseCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$PlayCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$PreviousCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$RefreshWidget;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$SeekBackwardCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$SeekForwardCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$SpotifyLogo;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$WrappedClick;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class WidgetInteraction implements Parcelable {

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$BackgroundSessionState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "UNAUTHENTICATED", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public enum BackgroundSessionState {
        ACTIVE,
        INACTIVE,
        UNAUTHENTICATED;

        private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

        public static lzv getEntries() {
            return $ENTRIES;
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$CurateCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "trackMetadata", "Lp/t5m;", "currentCurationState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;Lp/t5m;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "getTrackMetadata", "()Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "Lp/t5m;", "getCurrentCurationState", "()Lp/t5m;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class CurateCommand extends WidgetInteraction {
        public static final Parcelable.Creator<CurateCommand> CREATOR = new Creator();
        private final String branchCampaign;
        private final t5m currentCurationState;
        private final String pageIdentifier;
        private final CurrentTrackMetadata trackMetadata;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<CurateCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurateCommand createFromParcel(Parcel parcel) {
                return new CurateCommand(parcel.readString(), parcel.readString(), (CurrentTrackMetadata) parcel.readParcelable(CurateCommand.class.getClassLoader()), t5m.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurateCommand[] newArray(int i) {
                return new CurateCommand[i];
            }
        }

        public CurateCommand(String str, String str2, CurrentTrackMetadata currentTrackMetadata, t5m t5mVar) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
            this.trackMetadata = currentTrackMetadata;
            this.currentCurationState = t5mVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        public final t5m getCurrentCurationState() {
            return this.currentCurationState;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        public final CurrentTrackMetadata getTrackMetadata() {
            return this.trackMetadata;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
            dest.writeParcelable(this.trackMetadata, flags);
            dest.writeString(this.currentCurationState.name());
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "uri", "Landroid/net/Uri;", "shouldStartPlayback", "", "shouldOpenEntityPage", "<init>", "(Landroid/net/Uri;ZZ)V", "getUri", "()Landroid/net/Uri;", "getShouldStartPlayback", "()Z", "getShouldOpenEntityPage", "HeroItemClick", "GridItemClick", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick$GridItemClick;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick$HeroItemClick;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static abstract class ItemClick extends WidgetInteraction {
        private final boolean shouldOpenEntityPage;
        private final boolean shouldStartPlayback;
        private final Uri uri;

        public /* synthetic */ ItemClick(Uri uri, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, z, z2);
        }

        public final boolean getShouldOpenEntityPage() {
            return this.shouldOpenEntityPage;
        }

        public final boolean getShouldStartPlayback() {
            return this.shouldStartPlayback;
        }

        public final Uri getUri() {
            return this.uri;
        }

        private ItemClick(Uri uri, boolean z, boolean z2) {
            super(null);
            this.uri = uri;
            this.shouldStartPlayback = z;
            this.shouldOpenEntityPage = z2;
        }

        @Keep
        @Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\rJ\u0010\u0010\"\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*¨\u0006+"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick$HeroItemClick;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick;", "Landroid/net/Uri;", "heroItemUri", "", "pageIdentifier", "branchCampaign", "", "startPlayback", "openEntityPage", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "getPageIdentifierPath", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick$HeroItemClick;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getHeroItemUri", "Ljava/lang/String;", "Z", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* data */ class HeroItemClick extends ItemClick {
            public static final Parcelable.Creator<HeroItemClick> CREATOR = new Creator();
            private final String branchCampaign;
            private final Uri heroItemUri;
            private final boolean openEntityPage;
            private final String pageIdentifier;
            private final boolean startPlayback;

            @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
            public static final class Creator implements Parcelable.Creator<HeroItemClick> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HeroItemClick createFromParcel(Parcel parcel) {
                    return new HeroItemClick((Uri) parcel.readParcelable(HeroItemClick.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HeroItemClick[] newArray(int i) {
                    return new HeroItemClick[i];
                }
            }

            public HeroItemClick(Uri uri, String str, String str2, boolean z, boolean z2) {
                super(uri, z, z2, null);
                this.heroItemUri = uri;
                this.pageIdentifier = str;
                this.branchCampaign = str2;
                this.startPlayback = z;
                this.openEntityPage = z2;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            private final String getPageIdentifier() {
                return this.pageIdentifier;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            private final String getBranchCampaign() {
                return this.branchCampaign;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            private final boolean getStartPlayback() {
                return this.startPlayback;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            private final boolean getOpenEntityPage() {
                return this.openEntityPage;
            }

            public static /* synthetic */ HeroItemClick copy$default(HeroItemClick heroItemClick, Uri uri, String str, String str2, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = heroItemClick.heroItemUri;
                }
                if ((i & 2) != 0) {
                    str = heroItemClick.pageIdentifier;
                }
                if ((i & 4) != 0) {
                    str2 = heroItemClick.branchCampaign;
                }
                if ((i & 8) != 0) {
                    z = heroItemClick.startPlayback;
                }
                if ((i & 16) != 0) {
                    z2 = heroItemClick.openEntityPage;
                }
                boolean z3 = z2;
                String str3 = str2;
                return heroItemClick.copy(uri, str, str3, z, z3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Uri getHeroItemUri() {
                return this.heroItemUri;
            }

            public final HeroItemClick copy(Uri heroItemUri, String pageIdentifier, String branchCampaign, boolean startPlayback, boolean openEntityPage) {
                return new HeroItemClick(heroItemUri, pageIdentifier, branchCampaign, startPlayback, openEntityPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeroItemClick)) {
                    return false;
                }
                HeroItemClick heroItemClick = (HeroItemClick) other;
                return wj50.m88271j(this.heroItemUri, heroItemClick.heroItemUri) && wj50.m88271j(this.pageIdentifier, heroItemClick.pageIdentifier) && wj50.m88271j(this.branchCampaign, heroItemClick.branchCampaign) && this.startPlayback == heroItemClick.startPlayback && this.openEntityPage == heroItemClick.openEntityPage;
            }

            @Override // com.spotify.widgets.npvwidget.WidgetInteraction
            public String getBranchCampaign() {
                return this.branchCampaign;
            }

            public final Uri getHeroItemUri() {
                return this.heroItemUri;
            }

            @Override // com.spotify.widgets.npvwidget.WidgetInteraction
            /* JADX INFO: renamed from: getPageIdentifierPath */
            public String getPageIdentifier() {
                return this.pageIdentifier;
            }

            public int hashCode() {
                return Boolean.hashCode(this.openEntityPage) + s571.m77245d(s571.m77243b(s571.m77243b(this.heroItemUri.hashCode() * 31, 31, this.pageIdentifier), 31, this.branchCampaign), 31, this.startPlayback);
            }

            public String toString() {
                return super.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.heroItemUri, flags);
                dest.writeString(this.pageIdentifier);
                dest.writeString(this.branchCampaign);
                dest.writeInt(this.startPlayback ? 1 : 0);
                dest.writeInt(this.openEntityPage ? 1 : 0);
            }

            public /* synthetic */ HeroItemClick(Uri uri, String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uri, str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
            }
        }

        public /* synthetic */ ItemClick(Uri uri, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, z, (i & 4) != 0 ? true : z2, null);
        }

        @Keep
        @Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\nHÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u0010JV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u0010J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101¨\u00062"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick$GridItemClick;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick;", "Landroid/net/Uri;", "itemUri", "", "itemPosition", "", "itemReason", "pageIdentifier", "branchCampaign", "", "startPlayback", "openEntityPage", "<init>", "(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "component4", "()Ljava/lang/String;", "component5", "component6", "()Z", "component7", "getPageIdentifierPath", "getBranchCampaign", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Landroid/net/Uri;", "component2", "component3", "copy", "(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/spotify/widgets/npvwidget/WidgetInteraction$ItemClick$GridItemClick;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getItemUri", "I", "getItemPosition", "Ljava/lang/String;", "getItemReason", "Z", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* data */ class GridItemClick extends ItemClick {
            public static final Parcelable.Creator<GridItemClick> CREATOR = new Creator();
            private final String branchCampaign;
            private final int itemPosition;
            private final String itemReason;
            private final Uri itemUri;
            private final boolean openEntityPage;
            private final String pageIdentifier;
            private final boolean startPlayback;

            @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
            public static final class Creator implements Parcelable.Creator<GridItemClick> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GridItemClick createFromParcel(Parcel parcel) {
                    return new GridItemClick((Uri) parcel.readParcelable(GridItemClick.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GridItemClick[] newArray(int i) {
                    return new GridItemClick[i];
                }
            }

            public GridItemClick(Uri uri, int i, String str, String str2, String str3, boolean z, boolean z2) {
                super(uri, z, z2, null);
                this.itemUri = uri;
                this.itemPosition = i;
                this.itemReason = str;
                this.pageIdentifier = str2;
                this.branchCampaign = str3;
                this.startPlayback = z;
                this.openEntityPage = z2;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            private final String getPageIdentifier() {
                return this.pageIdentifier;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            private final String getBranchCampaign() {
                return this.branchCampaign;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            private final boolean getStartPlayback() {
                return this.startPlayback;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            private final boolean getOpenEntityPage() {
                return this.openEntityPage;
            }

            public static /* synthetic */ GridItemClick copy$default(GridItemClick gridItemClick, Uri uri, int i, String str, String str2, String str3, boolean z, boolean z2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    uri = gridItemClick.itemUri;
                }
                if ((i2 & 2) != 0) {
                    i = gridItemClick.itemPosition;
                }
                if ((i2 & 4) != 0) {
                    str = gridItemClick.itemReason;
                }
                if ((i2 & 8) != 0) {
                    str2 = gridItemClick.pageIdentifier;
                }
                if ((i2 & 16) != 0) {
                    str3 = gridItemClick.branchCampaign;
                }
                if ((i2 & 32) != 0) {
                    z = gridItemClick.startPlayback;
                }
                if ((i2 & 64) != 0) {
                    z2 = gridItemClick.openEntityPage;
                }
                boolean z3 = z;
                boolean z4 = z2;
                String str4 = str3;
                String str5 = str;
                return gridItemClick.copy(uri, i, str5, str2, str4, z3, z4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Uri getItemUri() {
                return this.itemUri;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getItemPosition() {
                return this.itemPosition;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getItemReason() {
                return this.itemReason;
            }

            public final GridItemClick copy(Uri itemUri, int itemPosition, String itemReason, String pageIdentifier, String branchCampaign, boolean startPlayback, boolean openEntityPage) {
                return new GridItemClick(itemUri, itemPosition, itemReason, pageIdentifier, branchCampaign, startPlayback, openEntityPage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GridItemClick)) {
                    return false;
                }
                GridItemClick gridItemClick = (GridItemClick) other;
                return wj50.m88271j(this.itemUri, gridItemClick.itemUri) && this.itemPosition == gridItemClick.itemPosition && wj50.m88271j(this.itemReason, gridItemClick.itemReason) && wj50.m88271j(this.pageIdentifier, gridItemClick.pageIdentifier) && wj50.m88271j(this.branchCampaign, gridItemClick.branchCampaign) && this.startPlayback == gridItemClick.startPlayback && this.openEntityPage == gridItemClick.openEntityPage;
            }

            @Override // com.spotify.widgets.npvwidget.WidgetInteraction
            public String getBranchCampaign() {
                return this.branchCampaign;
            }

            public final int getItemPosition() {
                return this.itemPosition;
            }

            public final String getItemReason() {
                return this.itemReason;
            }

            public final Uri getItemUri() {
                return this.itemUri;
            }

            @Override // com.spotify.widgets.npvwidget.WidgetInteraction
            /* JADX INFO: renamed from: getPageIdentifierPath */
            public String getPageIdentifier() {
                return this.pageIdentifier;
            }

            public int hashCode() {
                return Boolean.hashCode(this.openEntityPage) + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.itemPosition, this.itemUri.hashCode() * 31, 31), 31, this.itemReason), 31, this.pageIdentifier), 31, this.branchCampaign), 31, this.startPlayback);
            }

            public String toString() {
                return super.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.itemUri, flags);
                dest.writeInt(this.itemPosition);
                dest.writeString(this.itemReason);
                dest.writeString(this.pageIdentifier);
                dest.writeString(this.branchCampaign);
                dest.writeInt(this.startPlayback ? 1 : 0);
                dest.writeInt(this.openEntityPage ? 1 : 0);
            }

            public /* synthetic */ GridItemClick(Uri uri, int i, String str, String str2, String str3, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(uri, i, (i2 & 4) != 0 ? WidgetStateKt.DEFAULT_REASON : str, str2, str3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? true : z2);
            }
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\bJ\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001e¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$Login;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "getPageIdentifierPath", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/widgets/npvwidget/WidgetInteraction$Login;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Login extends WidgetInteraction {
        public static final Parcelable.Creator<Login> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<Login> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Login createFromParcel(Parcel parcel) {
                return new Login(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Login[] newArray(int i) {
                return new Login[i];
            }
        }

        public Login(String str, String str2) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final String getPageIdentifier() {
            return this.pageIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final String getBranchCampaign() {
            return this.branchCampaign;
        }

        public static /* synthetic */ Login copy$default(Login login, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = login.pageIdentifier;
            }
            if ((i & 2) != 0) {
                str2 = login.branchCampaign;
            }
            return login.copy(str, str2);
        }

        public final Login copy(String pageIdentifier, String branchCampaign) {
            return new Login(pageIdentifier, branchCampaign);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Login)) {
                return false;
            }
            Login login = (Login) other;
            return wj50.m88271j(this.pageIdentifier, login.pageIdentifier) && wj50.m88271j(this.branchCampaign, login.branchCampaign);
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        public int hashCode() {
            return this.branchCampaign.hashCode() + (this.pageIdentifier.hashCode() * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$NextCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class NextCommand extends WidgetInteraction {
        public static final Parcelable.Creator<NextCommand> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<NextCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NextCommand createFromParcel(Parcel parcel) {
                return new NextCommand(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NextCommand[] newArray(int i) {
                return new NextCommand[i];
            }
        }

        public NextCommand(String str, String str2) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\tJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\tJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\tJ\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\t¨\u0006\""}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$NpvMetadata;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "getPageIdentifierPath", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/widgets/npvwidget/WidgetInteraction$NpvMetadata;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class NpvMetadata extends WidgetInteraction {
        public static final Parcelable.Creator<NpvMetadata> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;
        private final String uri;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<NpvMetadata> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NpvMetadata createFromParcel(Parcel parcel) {
                return new NpvMetadata(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NpvMetadata[] newArray(int i) {
                return new NpvMetadata[i];
            }
        }

        public NpvMetadata(String str, String str2, String str3) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
            this.uri = str3;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final String getPageIdentifier() {
            return this.pageIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final String getBranchCampaign() {
            return this.branchCampaign;
        }

        public static /* synthetic */ NpvMetadata copy$default(NpvMetadata npvMetadata, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = npvMetadata.pageIdentifier;
            }
            if ((i & 2) != 0) {
                str2 = npvMetadata.branchCampaign;
            }
            if ((i & 4) != 0) {
                str3 = npvMetadata.uri;
            }
            return npvMetadata.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final NpvMetadata copy(String pageIdentifier, String branchCampaign, String uri) {
            return new NpvMetadata(pageIdentifier, branchCampaign, uri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NpvMetadata)) {
                return false;
            }
            NpvMetadata npvMetadata = (NpvMetadata) other;
            return wj50.m88271j(this.pageIdentifier, npvMetadata.pageIdentifier) && wj50.m88271j(this.branchCampaign, npvMetadata.branchCampaign) && wj50.m88271j(this.uri, npvMetadata.uri);
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + s571.m77243b(this.pageIdentifier.hashCode() * 31, 31, this.branchCampaign);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
            dest.writeString(this.uri);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$PauseCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class PauseCommand extends WidgetInteraction {
        public static final Parcelable.Creator<PauseCommand> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<PauseCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PauseCommand createFromParcel(Parcel parcel) {
                return new PauseCommand(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PauseCommand[] newArray(int i) {
                return new PauseCommand[i];
            }
        }

        public PauseCommand(String str, String str2) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$PreviousCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPageIdentifier", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class PreviousCommand extends WidgetInteraction {
        public static final Parcelable.Creator<PreviousCommand> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<PreviousCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviousCommand createFromParcel(Parcel parcel) {
                return new PreviousCommand(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviousCommand[] newArray(int i) {
                return new PreviousCommand[i];
            }
        }

        public PreviousCommand(String str, String str2) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        public final String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$RefreshWidget;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class RefreshWidget extends WidgetInteraction {
        public static final Parcelable.Creator<RefreshWidget> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<RefreshWidget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RefreshWidget createFromParcel(Parcel parcel) {
                return new RefreshWidget(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RefreshWidget[] newArray(int i) {
                return new RefreshWidget[i];
            }
        }

        public RefreshWidget(String str, String str2) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$SeekBackwardCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class SeekBackwardCommand extends WidgetInteraction {
        public static final Parcelable.Creator<SeekBackwardCommand> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<SeekBackwardCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SeekBackwardCommand createFromParcel(Parcel parcel) {
                return new SeekBackwardCommand(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SeekBackwardCommand[] newArray(int i) {
                return new SeekBackwardCommand[i];
            }
        }

        public SeekBackwardCommand(String str, String str2) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$SeekForwardCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class SeekForwardCommand extends WidgetInteraction {
        public static final Parcelable.Creator<SeekForwardCommand> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<SeekForwardCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SeekForwardCommand createFromParcel(Parcel parcel) {
                return new SeekForwardCommand(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SeekForwardCommand[] newArray(int i) {
                return new SeekForwardCommand[i];
            }
        }

        public SeekForwardCommand(String str, String str2) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$WrappedClick;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDeeplink", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class WrappedClick extends WidgetInteraction {
        public static final Parcelable.Creator<WrappedClick> CREATOR = new Creator();
        private final String branchCampaign;
        private final String deeplink;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<WrappedClick> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrappedClick createFromParcel(Parcel parcel) {
                return new WrappedClick(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrappedClick[] newArray(int i) {
                return new WrappedClick[i];
            }
        }

        public WrappedClick(String str, String str2, String str3) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
            this.deeplink = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
            dest.writeString(this.deeplink);
        }
    }

    public /* synthetic */ WidgetInteraction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getBranchCampaign();

    /* JADX INFO: renamed from: getPageIdentifierPath */
    public abstract String getPageIdentifier();

    private WidgetInteraction() {
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$PlayCommand;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "contextUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageIdentifierPath", "()Ljava/lang/String;", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getContextUri", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class PlayCommand extends WidgetInteraction {
        public static final Parcelable.Creator<PlayCommand> CREATOR = new Creator();
        private final String branchCampaign;
        private final String contextUri;
        private final String pageIdentifier;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<PlayCommand> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlayCommand createFromParcel(Parcel parcel) {
                return new PlayCommand(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlayCommand[] newArray(int i) {
                return new PlayCommand[i];
            }
        }

        public PlayCommand(String str, String str2, String str3) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
            this.contextUri = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        public final String getContextUri() {
            return this.contextUri;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath, reason: from getter */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
            dest.writeString(this.contextUri);
        }

        public /* synthetic */ PlayCommand(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "" : str3);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\tJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\tJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\tJ\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\t¨\u0006\""}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$SpotifyLogo;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "getPageIdentifierPath", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/widgets/npvwidget/WidgetInteraction$SpotifyLogo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReason", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class SpotifyLogo extends WidgetInteraction {
        public static final Parcelable.Creator<SpotifyLogo> CREATOR = new Creator();
        private final String branchCampaign;
        private final String pageIdentifier;
        private final String reason;

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<SpotifyLogo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpotifyLogo createFromParcel(Parcel parcel) {
                return new SpotifyLogo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpotifyLogo[] newArray(int i) {
                return new SpotifyLogo[i];
            }
        }

        public SpotifyLogo(String str, String str2, String str3) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
            this.reason = str3;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final String getPageIdentifier() {
            return this.pageIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final String getBranchCampaign() {
            return this.branchCampaign;
        }

        public static /* synthetic */ SpotifyLogo copy$default(SpotifyLogo spotifyLogo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spotifyLogo.pageIdentifier;
            }
            if ((i & 2) != 0) {
                str2 = spotifyLogo.branchCampaign;
            }
            if ((i & 4) != 0) {
                str3 = spotifyLogo.reason;
            }
            return spotifyLogo.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final SpotifyLogo copy(String pageIdentifier, String branchCampaign, String reason) {
            return new SpotifyLogo(pageIdentifier, branchCampaign, reason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpotifyLogo)) {
                return false;
            }
            SpotifyLogo spotifyLogo = (SpotifyLogo) other;
            return wj50.m88271j(this.pageIdentifier, spotifyLogo.pageIdentifier) && wj50.m88271j(this.branchCampaign, spotifyLogo.branchCampaign) && wj50.m88271j(this.reason, spotifyLogo.reason);
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + s571.m77243b(this.pageIdentifier.hashCode() * 31, 31, this.branchCampaign);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
            dest.writeString(this.reason);
        }

        public /* synthetic */ SpotifyLogo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? WidgetStateKt.DEFAULT_REASON : str3);
        }
    }

    @Keep
    @Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJ8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\u000bR\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010\u000b¨\u0006+"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$Background;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction;", "", "pageIdentifier", "branchCampaign", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$BackgroundSessionState;", "sessionState", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/widgets/npvwidget/WidgetInteraction$BackgroundSessionState;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "getPageIdentifierPath", "getBranchCampaign", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component3", "()Lcom/spotify/widgets/npvwidget/WidgetInteraction$BackgroundSessionState;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/widgets/npvwidget/WidgetInteraction$BackgroundSessionState;Ljava/lang/String;)Lcom/spotify/widgets/npvwidget/WidgetInteraction$Background;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Lcom/spotify/widgets/npvwidget/WidgetInteraction$BackgroundSessionState;", "getSessionState", "getUri", "getDestinationViewUri", "destinationViewUri", "Companion", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Background extends WidgetInteraction {

        @Deprecated
        public static final String DESTINATION_HOME = "spotify:home";

        @Deprecated
        public static final String DESTINATION_NPV = "spotify:now-playing-view-v2";
        private final String branchCampaign;
        private final String pageIdentifier;
        private final BackgroundSessionState sessionState;
        private final String uri;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Background> CREATOR = new Creator();

        @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetInteraction$Background$Companion;", "", "<init>", "()V", "DESTINATION_NPV", "", "DESTINATION_HOME", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Creator implements Parcelable.Creator<Background> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Background createFromParcel(Parcel parcel) {
                return new Background(parcel.readString(), parcel.readString(), BackgroundSessionState.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Background[] newArray(int i) {
                return new Background[i];
            }
        }

        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BackgroundSessionState.values().length];
                try {
                    iArr[BackgroundSessionState.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BackgroundSessionState.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BackgroundSessionState.UNAUTHENTICATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Background(String str, String str2, BackgroundSessionState backgroundSessionState, String str3) {
            super(null);
            this.pageIdentifier = str;
            this.branchCampaign = str2;
            this.sessionState = backgroundSessionState;
            this.uri = str3;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final String getPageIdentifier() {
            return this.pageIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final String getBranchCampaign() {
            return this.branchCampaign;
        }

        public static /* synthetic */ Background copy$default(Background background, String str, String str2, BackgroundSessionState backgroundSessionState, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = background.pageIdentifier;
            }
            if ((i & 2) != 0) {
                str2 = background.branchCampaign;
            }
            if ((i & 4) != 0) {
                backgroundSessionState = background.sessionState;
            }
            if ((i & 8) != 0) {
                str3 = background.uri;
            }
            return background.copy(str, str2, backgroundSessionState, str3);
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BackgroundSessionState getSessionState() {
            return this.sessionState;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final Background copy(String pageIdentifier, String branchCampaign, BackgroundSessionState sessionState, String uri) {
            return new Background(pageIdentifier, branchCampaign, sessionState, uri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return wj50.m88271j(this.pageIdentifier, background.pageIdentifier) && wj50.m88271j(this.branchCampaign, background.branchCampaign) && this.sessionState == background.sessionState && wj50.m88271j(this.uri, background.uri);
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        public String getBranchCampaign() {
            return this.branchCampaign;
        }

        public final String getDestinationViewUri() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.sessionState.ordinal()];
            if (i == 1) {
                return DESTINATION_NPV;
            }
            if (i == 2 || i == 3) {
                return DESTINATION_HOME;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.spotify.widgets.npvwidget.WidgetInteraction
        /* JADX INFO: renamed from: getPageIdentifierPath */
        public String getPageIdentifier() {
            return this.pageIdentifier;
        }

        public final BackgroundSessionState getSessionState() {
            return this.sessionState;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + ((this.sessionState.hashCode() + s571.m77243b(this.pageIdentifier.hashCode() * 31, 31, this.branchCampaign)) * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.pageIdentifier);
            dest.writeString(this.branchCampaign);
            dest.writeString(this.sessionState.name());
            dest.writeString(this.uri);
        }

        public /* synthetic */ Background(String str, String str2, BackgroundSessionState backgroundSessionState, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, backgroundSessionState, (i & 8) != 0 ? "" : str3);
        }
    }
}
