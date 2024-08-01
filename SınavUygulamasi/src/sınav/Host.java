package sınav;

abstract class Host {

  // çağrı konusu seçici
   void subject() {
    subject_selector.select_subjet();
  }

  // call Question_setter
  boolean questions() {
    return question_setter.set_questions();
  }

  // Set_time'ı çağır

  public void time(int wait) {
    Set_time.set(wait);
  }

}
