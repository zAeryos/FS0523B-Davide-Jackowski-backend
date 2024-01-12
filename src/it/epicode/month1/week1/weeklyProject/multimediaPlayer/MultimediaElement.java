package it.epicode.month1.week1.weeklyProject.multimediaPlayer;

abstract class MultimediaElement {
    protected String title;
    protected int duration;

    public MultimediaElement(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
